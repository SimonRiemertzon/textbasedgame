import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Door door1 = new Door();
        //new Key(); /interactable
        //new Window(); /interactable

        System.out.println("Please enter your name, hero!");

        Player player = new Player(scan.next());
        Player enemy = new Player( "Goblin");

        Environment env1 = new Environment("Dark Room",
                "You wake up in a dark room. You can see",
                new ArrayList<Interactable>(Arrays.asList(door1)),
                new ArrayList<String>(Arrays.asList("Go to the door"))
        );

        System.out.println(env1);

        try {
            final int choice = scan.nextInt();
            env1.doActionsWith(choice,  player);


        } catch (InputMismatchException e) {
            System.out.println("You entered something that is not a number. ");
        }








//
//            Scanner scan = new Scanner(System.in);
//            Player player1 = new Player("Jane Doe");
//            Interactive[] things = { new Horse(), new Mirror() };
//            System.out.println("Du ser: ");
//            for (Interactive thing : things) {
//                System.out.println(thing.getName());
//            }
//            String answer;
//            do {
//                System.out.println("Vad vill du använda?");
//                answer = scan.nextLine();
//                answer = answer.trim();
//                for (Interactive thing : things) {
//                    if (answer.equals(thing.getName())) {
//                        thing.interact(player1);
//                        break;
//                    }
//                }
//            } while (!"avsluta".equals(answer));
//        }
    }
 }

