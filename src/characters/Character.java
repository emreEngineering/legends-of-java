package characters;

import items.Damage;
import strategies.AttackStrategy;
import strategies.DefenseStrategy;
import items.LootItem;
import java.util.List;

public abstract class Character implements Attacker, Defender {
   protected String name;
   protected int health;
   protected int maxHealth;
   protected AttackStrategy attackStrategy;
   protected DefenseStrategy defenseStrategy;

   public Character(String name, int maxHealth) {
      this.name = name;
      this.maxHealth = maxHealth;
      this.health = maxHealth;
   }

   public String getName() { return name; }
   public int getHealth() { return health; }
   public boolean isAlive() { return health > 0; }

   @Override
   public void attack(Character target) {
      Damage damage = attackStrategy.computeDamage(this, target);
      int finalDamage = target.defend(damage);
      target.takeDamage(finalDamage);
      System.out.println(name + " attacks " + target.getName() + " for " + finalDamage + " damage!");
   }

   @Override
   public int defend(Damage incoming) {
      return defenseStrategy.mitigate(this, incoming);
   }

   public void takeDamage(int amount) {
      health -= amount;
      if (health < 0) health = 0;
   }

   public abstract List<LootItem> dropLoot();
}
