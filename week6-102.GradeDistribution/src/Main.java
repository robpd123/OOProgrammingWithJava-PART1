
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

        Scanner reader = new Scanner(System.in);
        Grades grades = new Grades();
        
        System.out.println("Type exams scores, -1 completes:");
        
        while (true){
            int currentScore = Integer.parseInt(reader.nextLine());
            if (currentScore == -1){
                break;
            }
            grades.addAScore(currentScore);
        }
        
        grades.print();
    }

}
