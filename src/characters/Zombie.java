package characters;

import characters.Monster;
import items.LootItem;
import items.Rarity;
import strategies.MeleeAttack;
import strategies.ShieldBlock;

import java.util.Arrays;
import java.util.List;

public class Zombie extends Monster {
    public Zombie(String name) {
        super(name, 100);
        this.attackStrategy = new MeleeAttack();
        this.defenseStrategy = new ShieldBlock();
    }
    @Override
    public List<LootItem> dropLoot() {
        return Arrays.asList(
                new LootItem("Rotten Flesh", Rarity.COMMON)
        );
    }
}