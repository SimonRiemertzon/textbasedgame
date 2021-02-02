import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;


import org.junit.jupiter.api.Test;

class EnvironmentTest {
	
	

	@Test
	public void testAddEnvironment() {
		ArrayList list = new ArrayList<>();
		Door door1 = new Door();
		Environment room = new Environment("room", "dark and cold", new ArrayList<Interactable>(Arrays.asList(door1)));
		assertTrue(room.getName() == "room");
		assertTrue(room.getDescription() == "dark and cold");
		assertTrue(room.getListOfInteractables().contains(door1));
	}
	
	public void testToString() {
		
	}

}
