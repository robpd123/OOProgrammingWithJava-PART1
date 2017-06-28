
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        String text;
        
        System.out.print("Type your name: ");
        text = reader.nextLine();
        System.out.println("Number of characters: " + calculateCharacters(text));
        
    }
    
    public static int calculateCharacters(String text){
        return text.length();
    }
    
    
    
    // do here the method
    // public static int calculateCharacters(String text)
    
}
