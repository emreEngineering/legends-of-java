package characters;
import items.LootItem;
import items.Rarity;
import strategies.FireballAttack;
import strategies.MagicBarrier;

import java.util.Arrays;
import java.util.List;

public class Dragon extends Monster {
    public Dragon(String name) {
        super(name, 200);
        this.attackStrategy = new FireballAttack();
        this.defenseStrategy = new MagicBarrier();
    }
    @Override
    public List<LootItem> dropLoot() {
        return Arrays.asList(
                new LootItem("Dragon Scale", Rarity.RARE),
                new LootItem("Gold Coin", Rarity.COMMON)
        );
    }
}