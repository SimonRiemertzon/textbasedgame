import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;


import org.junit.jupiter.api.Test;

class EnvironmentTest {
	
	

	@Test
	public void testAddEnvironment() {
		ArrayList list = new ArrayList<>();
		
		Environment room = new Environment("room", "dark and cold", "ta nyckeln", list);
		assertTrue(room.getName() == "room");
		assertTrue(room.getDescription() == "dark and cold");
		assertTrue(room.getListOfActions() == "ta nyckeln");
	}
	
	public void testToString() {
		Environment room = new Environment("room", "dark and cold", "ta nyckeln", list);
		public String toString() {
			return name + description;
		}
	}

}
