package strategies;

import items.Damage;
import items.DamageType;
import characters.Character;

import java.util.Random;

public class FireballAttack implements AttackStrategy{
    private final Random random = new Random();

    @Override
    public Damage computeDamage(Character attacker, Character defender) {
        int dmg = 15 + random.nextInt(16); // Random damage between 15 and 30
        return new Damage(dmg, DamageType.FIRE);
    }
}
