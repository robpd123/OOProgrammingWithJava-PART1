import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        String name;

        System.out.print("Type your name: ");
        name = reader.nextLine();
        System.out.println("Number of characters: " + lastCharacter(name));

    }

    public static char lastCharacter(String text) {
        return text.charAt(text.length()-1);
    }
}
