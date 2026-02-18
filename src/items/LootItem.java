package items;

public class LootItem {
    private final String name;
    private final Rarity rarity;

    public LootItem(String name, Rarity rarity) {
        this.name = name;
        this.rarity = rarity;
    }

    public String getName() {
        return name;
    }

    public Rarity getRarity() {
        return rarity;
    }
}
