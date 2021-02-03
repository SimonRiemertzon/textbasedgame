import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {

    @Test
    void gethealthpoints() {
        Player p1 = new Player(100, "Bosse");
        assertEquals(100, p1.getHealthPoints());
    }

    @Test
    void getWrongHealthPoints() {
        Player p1 = new Player(100,"Bosse");
        assertFalse(p1.getHealthPoints() == 90);
    }

    @Test
    void getName() {
    	Player p1 = new Player(100, "Axel");
    	assertEquals("Axel", p1.getName());
    }

    @Test
    void takedamage() {
    	Player p1 = new Player(100, "Axel");
    	int healtPointsBeforeDamage = p1.getHealthPoints();
    	p1.takeDamage(10);
    	int healtPointsAfterDamage = p1.getHealthPoints();
    	assertEquals(healtPointsAfterDamage, healtPointsBeforeDamage - 10);
    }

    @Test
    void doAction() {
    	Player p1 = new Player(100, "Axel");
    	assertEquals(p1.doAction() = true);
    }
}