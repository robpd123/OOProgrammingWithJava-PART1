import java.util.Scanner;

public class ReversingName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String name;
        int i = 0;
        
        System.out.print("Type your name: ");
        name = reader.nextLine();
        i = name.length() -1;
        
        while (i >= 0){
            System.out.print(name.charAt(i));
            i--;
        }
    }
}
