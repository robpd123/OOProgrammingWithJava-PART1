import java.util.Scanner;

public class TheEndPart {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
                String word;
        int length;
        
        System.out.print("Type a word: ");
        word = reader.nextLine();
        System.out.print("Length of the end part: ");
        length = Integer.parseInt(reader.nextLine());
        System.out.println("Result: " + word.substring(word.length()-length));
    }
}
