import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Door door1 = new Door();

        Enviroment env1 = new Enviroment("Dark Room",
                "You wake up in a dark room. You can see",
                new ArrayList<Interactable>(Arrays.asList(new Door())),
                new ArrayList<String>(Arrays.asList("Go to the door"))
        );

        System.out.println("\n" + env1);


    }


}
