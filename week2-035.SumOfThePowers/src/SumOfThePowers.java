
import java.util.Scanner;

public class SumOfThePowers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Type a number ");
        int limit = Integer.parseInt(reader.nextLine());
        int power = 1;
        int sumOfPowers = 1;

        while (power <= limit) {
            sumOfPowers += (int) Math.pow(2, power);
            power++;
        }

        System.out.println("The result is " + sumOfPowers);
    }
}
