
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
        Scanner reader = new Scanner(System.in);
        String command = "";
        BirdDatabase birds = new BirdDatabase();

        while (true) {
            System.out.print("? ");
            command = reader.nextLine();

            if (command.equals("Add")) {
                System.out.print("Name: ");
                String name = reader.nextLine();
                System.out.print("Latin Name: ");
                String latinName = reader.nextLine();

                birds.add(name, latinName);
            }

            if (command.equals("Observation")) {
                System.out.print("What was observed:? ");
                String name = reader.nextLine();
                if (!birds.observation(name)) {
                    System.out.println("Is not a bird!");
                }
            }

            if (command.equals("Statistics")) {
                birds.statistics();
            }

            if (command.equals("Show")) {
                System.out.print("What? ");
                String name = reader.nextLine();
                if (!birds.show(name)) {
                    System.out.println("Is not a bird!");
                }
            }

            if (command.equals("Quit")) {
                break;
            }
        }

    }
}
