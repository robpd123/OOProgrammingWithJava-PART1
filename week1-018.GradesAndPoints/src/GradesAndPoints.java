
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
                System.out.print("Type the points [0-60]: ");
        int points = Integer.parseInt(reader.nextLine());
        
        
        if (points <30){
            System.out.println("\nGrade: failed");
        }
        else if (points<35){
            System.out.println("\nGrade: 1");   
        }
        else if (points<40){
            System.out.println("\nGrade: 2");   
        }
        else if (points<45){
            System.out.println("\nGrade: 3");   
        }
        else if (points<50){
            System.out.println("\nGrade: 4");   
        }
        else if (points<61){
            System.out.println("\nGrade: 5");   
        }

    }
}
