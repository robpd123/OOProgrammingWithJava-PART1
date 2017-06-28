
public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
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

    public static void printWhitespaces(int amount) {
        // 40.1
        while (amount > 0) {
            System.out.print(" ");
            amount--;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int row = 1;
        while (size > 0) {
            printWhitespaces(size - 1);
            printStars(row);
            row++;
            size--;
        }
    }

    public static void xmasTree(int height) {
        // 40.3
        int row = 1;
        int saveHeight = height;
        while (height > 0) {
            printWhitespaces(height - 1);
            printStars(row);
            height--;
            row += 2;
        }
        
        printWhitespaces(saveHeight-2);
        printStars(3);
        printWhitespaces(saveHeight-2);
        printStars(3);

    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        //printTriangle(5);
        //       System.out.println("---");
               xmasTree(14);
//        System.out.println("---");
//        xmasTree(10);
    }
}
