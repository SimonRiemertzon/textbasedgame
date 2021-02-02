
import java.awt.print.Book;

public class Player {
    private int healthPoints;
    private String name;
    private Boolean hasKey;

    public Player(String name) {
        this.healthPoints = 100;
        this.hasKey = false;
        this.name = name;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void takeDamage(int damage) {
        this.healthPoints -= damage;

        if (this.healthPoints <= 0) {
            System.out.printf("Spelet är över");
        }
    }

    public void doAction() {

    }

    public void setHasKey(Boolean hasKey) {
        this.hasKey = hasKey;
    }

    public boolean getHasKey() {
        return this.hasKey;
    }

    public int gethealthpoints() {
        return healthPoints;
    }

    public String getName() {
        return name;
    }

}