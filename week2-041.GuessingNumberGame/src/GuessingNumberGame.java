
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int numberGuessed = 0;
        int numberOfGuesses = 0;

        while (true) {
            System.out.println("Guess a number: ");
            numberGuessed = Integer.parseInt(reader.nextLine());
            numberOfGuesses++;

            if (numberDrawn > numberGuessed) {
                System.out.print("The number is greater, ");
            } else if (numberDrawn < numberGuessed) {
                System.out.print("The number is lesser, ");
            } else {
                System.out.println("Congratulations, your guess is correct!");
                break;
            }
            
            System.out.println("number of guesses made: " + numberOfGuesses);
            
        }

        // program your solution here. Do not touch the above lines!
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
