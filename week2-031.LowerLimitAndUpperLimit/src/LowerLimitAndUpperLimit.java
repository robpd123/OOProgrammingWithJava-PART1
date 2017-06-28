
import java.util.Scanner;

public class LowerLimitAndUpperLimit {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int first, last;

        System.out.print("First: ");
        first = Integer.parseInt(reader.nextLine());

        System.out.print("Last: ");
        last = Integer.parseInt(reader.nextLine());

        while (first <= last) {
            System.out.println(first);
            first++;
        }

    }
}
