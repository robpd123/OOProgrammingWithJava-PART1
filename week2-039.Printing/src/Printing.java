
public class Printing {

    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        while (amount > 0) {
            System.out.print("*");
            amount--;
        }
        System.out.println("");
        // call this command amount times        
    }

    public static void printSquare(int sideSize) {
        // 39.2
        int count = sideSize;
        while (count > 0) {
            printStars(sideSize);
            count--;
        }
    }

    public static void printRectangle(int width, int height) {
        // 39.3
        while (height > 0) {
            printStars(width);
            height--;
        }
    }

    public static void printTriangle(int size) {
        // 39.4
        int count = 1;
        while (count <= size) {
            printStars(count);
            count++;
        }
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!
        // if you have problems with tests, please try out first 
        // here to see that the printout looks correct

//        printStars(3);
//        printStars(5);
//        printStars(2);
//        printSquare(5);
//        System.out.println("\n---");  // printing --- to separate the figures
//        printSquare(4);
//        System.out.println("\n---");
//        printRectangle(5, 6);
//        System.out.println("\n---");
        printTriangle(5);
//        System.out.println("\n---");
    }

}
