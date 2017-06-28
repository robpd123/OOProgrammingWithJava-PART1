import java.util.ArrayList;

public class Variance {
    // Copy here sum from exercise 63 
    public static int sum(ArrayList<Integer> list) {
        // Write your code here
        int sum = 0;

        for (int i : list) {
            sum += i;
        }
        return sum;
    }
    

    public static double average(ArrayList<Integer> list) {
        // write code here
        return (double)sum(list)/list.size();
    }

    public static double variance(ArrayList<Integer> list) {
        // write code here
        double average = average(list);
        double variance = 0;
        double numberMinusAv = 0;
        
        for (int number : list){
            numberMinusAv = (double)number - average;
            variance += Math.pow(numberMinusAv, 2);
        }
        
        variance /= (list.size()-1);
        return variance;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3);
        list.add(2);
        list.add(7);
        list.add(2);
        
        System.out.println("The variance is: " + variance(list));
    }

}
