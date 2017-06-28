
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        double temperature;
        
        while(true){
            System.out.println("Please input temperature: ");
            temperature = Double.parseDouble(reader.nextLine());
            if (temperature >= -30 && temperature <= 40){
                Graph.addNumber(temperature);
            }
        }
        // Write your code here. 


    }
}