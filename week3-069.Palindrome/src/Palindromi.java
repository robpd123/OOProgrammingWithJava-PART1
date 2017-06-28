
import java.util.Scanner;

public class Palindromi {

    public static String reverseText(String text) {
        String reversedText = "";
        int i = text.length() - 1;

        while (i >= 0) {
            reversedText += text.charAt(i);
            i--;
        }

        return reversedText;
    }

    public static boolean palindrome(String text) {

        if (text.equals(reverseText(text))) {
            return true;
        }
        // write code here
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a text: ");
        String text = reader.nextLine();
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
