import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HelloTest {

	@Test
	void printHallotest() {
		assertEquals("Hello world",PrintHello.printHello());
	}

}
