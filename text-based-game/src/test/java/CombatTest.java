import org.junit.jupiter.api.Test;

import java.util.concurrent.ThreadLocalRandom;

import static org.junit.jupiter.api.Assertions.*;

class CombatTest {

    @Test
    void PlayerBeatsEnemyTest() {
        Player p1 = new Player(100, "Bosse");
        Player p2 = new Player(100, "Enemy");

        double chance = 0.4;
        int rand = 10;

        if (chance < 0.5) {
            System.out.println(p1.getName() + " damages " + p2.getName());
            p2.takeDamage(rand);
        }else {
            System.out.println(p2.getName() + " damages " + p1.getName());
            p1.takeDamage(rand);
        }

        assertTrue(p2.getHealthPoints() == 90);
    }

    @Test
    void EnemyBeatsPlayerTest() {
        Player p1 = new Player(100, "Bosse");
        Player p2 = new Player(100, "Enemy");

        double chance = 0.9;
        int rand = 10;

        if (chance < 0.5) {
            System.out.println(p1.getName() + " damages " + p2.getName());
            p2.takeDamage(rand);
        }else {
            System.out.println(p2.getName() + " damages " + p1.getName());
            p1.takeDamage(rand);
        }

        assertTrue(p1.getHealthPoints() == 90);
    }

    @Test
    void EnemyDeathTest() {
        Player p1 = new Player(100, "Bosse");
        Player p2 = new Player(20, "Enemy");



        do {
            double chance = 0.4;
            int rand = 10;

            if (chance < 0.5) {
                System.out.println(p1.getName() + " damages " + p2.getName());
                p2.takeDamage(rand);
            } else {
                System.out.println(p2.getName() + " damages " + p1.getName());
                p1.takeDamage(rand);
            }

        } while (p1.getHealthPoints() > 0 && p2.getHealthPoints() > 0);

        assertEquals(0, p2.getHealthPoints());
    }

    @Test
    void PlayerDeathTest() {
        Player p1 = new Player(40, "Bosse");
        Player p2 = new Player(100, "Enemy");


        do {
            double chance = 0.7;
            int rand = 10;

            if (chance < 0.5) {
                System.out.println(p1.getName() + " damages " + p2.getName());
                p2.takeDamage(rand);
            } else {
                System.out.println(p2.getName() + " damages " + p1.getName());
                p1.takeDamage(rand);
            }

        } while (p1.getHealthPoints() > 0 && p2.getHealthPoints() > 0);

      assertEquals(0, p1.getHealthPoints());
    }
}