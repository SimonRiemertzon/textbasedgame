import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoorTest {

    Door d1;
    Player p1;
    @BeforeEach
    void setup() {
        d1 = new Door();
        p1 = new Player(100, "Simon");
    }

    @Test
    void getName() {
        assertEquals("a door", d1.getName());
    }

    @Test
    void getIsOpen() {
        p1.setHasKey(true);
        d1.interact(p1);
        assertTrue(d1.getIsOpen());
    }
}