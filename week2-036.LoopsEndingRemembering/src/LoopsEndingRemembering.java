
import java.util.Scanner;

public class LoopsEndingRemembering {

    public static void main(String[] args) {
        // program in this project exercises 36.1-36.5
        // actually this is just one program that is split in many parts

        Scanner reader = new Scanner(System.in);
        int numberInput = 0;
        int sum = 0;
        int count = 0;
        int evenNumbers = 0;
        int oddNumbers = 0;

        System.out.println("Type numbers:");
        while (true) {
            numberInput = Integer.parseInt(reader.nextLine());
            if (numberInput == -1) {
                break;
            }

            sum += numberInput;
            count++;

            if (numberInput % 2 == 0) {
                evenNumbers++;
            } else {
                oddNumbers++;
            }

        }

        System.out.println("Thank you and see you later!");
        System.out.println("The sum is " + sum);
        System.out.println("How many numbers: " + (count));
        System.out.println("Average: " + (1.0 * (sum) / (count)));
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);

    }
}
