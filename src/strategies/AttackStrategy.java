package strategies;

import items.Damage;
import characters.Character;

public interface AttackStrategy {
    Damage computeDamage(Character attacker, Character defender);
}
