package characters;



public abstract class Player extends Character {
    protected int experience;

    public Player(String name, int maxHealth) {
        super(name, maxHealth);
        this.experience = 0;
    }

    public void gainExperience(int exp) {
        experience += exp;
        System.out.println(name + " gained " + exp + " XP! Total: " + experience);
    }
}

