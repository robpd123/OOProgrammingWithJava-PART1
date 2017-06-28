
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write testcode here
        // indexes:    0  1  2  3   4
        int[] values = {8, 3, 7, 9, 1, 2, 4};
        sort(values);
    }

    public static void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            swap(array, i, indexOfTheSmallestStartingFrom(array, i));
            System.out.println(Arrays.toString(array));
        }
    }

    public static int smallest(int[] array) {
        int smallestIndex = array[0];

        for (int i = 1; i < array.length; i++) {
            if (smallestIndex > array[i]) {
                smallestIndex = array[i];
            }
        }
        return smallestIndex;
    }

    public static int indexOfTheSmallest(int[] array) {
        int index = 0;

        for (int i = 1; i < array.length; i++) {
            if (array[index] > array[i]) {
                index = i;
            }
        }
        return index;
    }

    public static int indexOfTheSmallestStartingFrom(int[] array, int index) {
        int smallestIndex = index;

        for (int i = index; i < array.length; i++) {
            if (array[smallestIndex] > array[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp;

        temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
