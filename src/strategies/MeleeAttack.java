package strategies;

import items.Damage;
import items.DamageType;
import characters.Character;

import java.util.Random;

public class MeleeAttack implements AttackStrategy{
    private final Random random = new Random();

    @Override
    public Damage computeDamage(Character attacker, Character defender) {
      int dmg = 10 + random.nextInt(11); // Random damage between 10 and 20
        return new Damage(dmg, DamageType.PHYSICAL);
    }
}
