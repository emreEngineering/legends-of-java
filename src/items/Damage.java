package items;

public class Damage {
    private final int amount;
    private final DamageType type;

    public Damage(int amount, DamageType type) {
        this.amount = amount;
        this.type = type;
    }
    public int getAmount() {
        return amount;
    }
    public DamageType getType() {
        return type;
    }
}

