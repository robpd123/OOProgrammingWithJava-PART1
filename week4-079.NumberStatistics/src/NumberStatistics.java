
import java.util.ArrayList;

public class NumberStatistics {

    private int amountOfNumbers;
    private ArrayList<Integer> numbers;

    public NumberStatistics() {
        amountOfNumbers = 0;
        numbers = new ArrayList<Integer>();
    }

    public void addNumber(int number) {
        numbers.add(number);
        this.amountOfNumbers++;
    }

    public int amountOfNumbers() {
        return this.amountOfNumbers;
    }

    public int sum() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return sum;
    }

    public double average() {
        if (amountOfNumbers > 0) {
            return (double) this.sum() / this.amountOfNumbers;
        } else {
            return 0;
        }
    }
}
