
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int counter = 1;
        
        System.out.print("Up to what number? ");
        int countMax = Integer.parseInt(reader.nextLine());
        
        while (counter <= countMax){
            System.out.println(counter);
            counter++;
        }
        
        
        // Write your code here
        
    }
}
