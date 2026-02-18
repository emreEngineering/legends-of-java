package characters;

import items.LootItem;
import strategies.MeleeAttack;
import strategies.ShieldBlock;

import java.util.Collections;
import java.util.List;

public class Warrior extends Player {
    public Warrior(String name) {
        super(name, 120);
        this.attackStrategy = new MeleeAttack();
        this.defenseStrategy = new ShieldBlock();
    }

    @Override
    public List<LootItem> dropLoot() {
        return Collections.emptyList();
    }
}
