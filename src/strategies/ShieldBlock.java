package strategies;

import items.Damage;
import characters.Character;

public class ShieldBlock implements DefenseStrategy {
    @Override
    public int mitigate(Character defender, Damage incoming) {
    int reduction = incoming.getAmount() - 5;
    return Math.max(reduction, 0);
    }
}
