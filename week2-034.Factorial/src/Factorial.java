import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.print("Type a number ");
        int limit = Integer.parseInt(reader.nextLine());
        int multiplier = 1;
        int factorial = 1;

        while (multiplier <= limit) {
            factorial *= multiplier;
            multiplier++;
        }

        System.out.println("Sum is " + factorial);

    }
}
