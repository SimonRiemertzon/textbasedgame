import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        setup();

        Scanner scan = new Scanner(System.in);
        Door door1 = new Door();

        System.out.println("Please enter your name, hero!");

        Player player = new Player(100, scan.next());
        Player enemy = new Player(30,  "Goblin");

        Environment env1 = new Environment("Dark Room",
                "You wake up in a dark room. You can see",
                new ArrayList<Interactable>(Arrays.asList(door1))
        );

        System.out.println(env1);
        
       
        try {
            while (!player.getHasKey()) {
                System.out.println("What would you like to do?");
                System.out.println("1. Go to the door");
                System.out.println("2. Go to the table");
                System.out.println("3. Go to the window");
                final int choice = scan.nextInt();
                if(choice == 1 ) {
                    System.out.println("You walk to the door.");
                    door1.interact(player);
                } else if(choice == 2) {
                    System.out.println("You walk to the table");
                    Table tbl = new Table();
                    tbl.interact(player);
                } else if(choice == 3) {
                    System.out.println("You walk to the window");
                    Window billgates = new Window();
                    billgates.interact(player);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You entered something that is not a number. Quitting game");
        }

        try {
            while(!door1.getIsOpen()) {
                System.out.println("What would you like to do?");
                System.out.println("1. Go to the door");
                System.out.println("2. Go to the table");
                System.out.println("3. Go to the window");

                final int choice = scan.nextInt();
                if(choice == 1 ) {
                    System.out.println("You walk to the door.");
                    door1.interact(player);
                } else if(choice == 2) {
                    System.out.println("You walk to the table");
                    Table tbl = new Table();
                    tbl.interact(player);
                } else if(choice == 3) {
                    System.out.println("You walk to the window");
                    Window billgates = new Window();
                    billgates.interact(player);
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("You entered something that is not a number. Quitting game");
        }

        System.out.println("YOU GET ATTACKED BY A GOBLIN! :O ");
        System.out.println("PRESS ANY KEY AND ENTER TO CONTINUE");
        scan.hasNext();
        Combat.combat(player, enemy);
















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

    private static void setup() {


    }
}


