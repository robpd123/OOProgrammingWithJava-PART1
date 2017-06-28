
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        int i = 0;
        
        System.out.print("Type you name: ");
        name= reader.nextLine();
        
        while (i < name.length()){
            System.out.println((i + 1) + ". character: " + name.charAt(i));
            i++;
        }
        
    }
}
