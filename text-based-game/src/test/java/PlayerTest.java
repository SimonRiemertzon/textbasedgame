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
    	//Player p1 = new Player(100, "Axel");
    	//assertEquals("Axel", p1.getName());
    }

    @Test
    void takedamage() {
        fail("Not yet implemented");
    }

    @Test
    void doAction() {
        fail("Not yet implemented");
    }
}

