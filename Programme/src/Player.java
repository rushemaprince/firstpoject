public class Player {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name = "Rushema";

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    private double health = 100;

    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }

    private double armor = 100;

    public Player() {
    }

    public Player(String name, double health, double armor) {
        this.name = name;
        this.health = health;
        this.armor = armor;
    }
}

