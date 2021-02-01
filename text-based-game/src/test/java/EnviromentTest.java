import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class EnviromentTest {

    @BeforeEach
    void setUp() {
        Enviroment env = new Enviroment(name, description, listOfActions, listOfInteractables);
    }



}