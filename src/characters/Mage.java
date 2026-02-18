package characters;

import items.LootItem;
import strategies.FireballAttack;
import strategies.MagicBarrier;

import java.util.Collections;
import java.util.List;

public class Mage extends Player {
    public Mage(String name) {
        super(name, 80);
        this.attackStrategy = new FireballAttack();
        this.defenseStrategy = new MagicBarrier();
    }

    @Override
    public List<LootItem> dropLoot() {
        return Collections.emptyList();
    }
}