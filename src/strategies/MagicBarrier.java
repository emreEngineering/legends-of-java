package strategies;

import items.Damage;
import items.DamageType;
import characters.Character;

public class MagicBarrier implements DefenseStrategy{
    @Override
    public int mitigate(Character defender, Damage incoming) {
        if (incoming.getType() == DamageType.FIRE) {
            return incoming.getAmount() / 2;
        }
        return incoming.getAmount();
    }
}
