import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;


import org.junit.jupiter.api.Test;

class EnvironmentTest {
	
	

	@Test
	public void getNameTest() {
		Door door1 = new Door();
		Environment room = new Environment("room", "dark and cold", new ArrayList<Interactable>(Arrays.asList(door1)));
		assertTrue(room.getName() == "room");
	}
	
	@Test
	public void getDescriptionTest() {
		Door door1 = new Door();
		Environment room = new Environment("room", "dark and cold", new ArrayList<Interactable>(Arrays.asList(door1)));
		assertTrue(room.getDescription() == "dark and cold");
		}
	
	@Test
	public void getListOfInteractablesTest() {
		Door door1 = new Door();
		Environment room = new Environment("room", "dark and cold", new ArrayList<Interactable>(Arrays.asList(door1)));
		assertTrue(room.getListOfInteractables().contains(door1));
	}
	
	@Test
	
	public void toStringTest() {
		Door door1 = new Door();
		Environment room = new Environment("room", "dark and cold", new ArrayList<Interactable>(Arrays.asList(door1)));
		
		assertEquals("dark and cold\n a door\n", room.toString());
	}
}



