package strategies;

import items.Damage;
import characters.Character;

public interface DefenseStrategy {
    int mitigate(Character defender, Damage incoming);
}
