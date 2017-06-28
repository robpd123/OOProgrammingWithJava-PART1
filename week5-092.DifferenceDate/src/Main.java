
public class Main {

    public static void main(String[] args) {
        // write testcode here

     MyDate date1 = new MyDate(10,3,2011);
     MyDate date2 = new MyDate(9,3,2012);
     
        System.out.println(date1.toString() + " " + date2 + " " + " " + date1.differenceInYears(date2));
 
               System.out.println(date1.toString() + " " + date2 + " " + " " + date2.differenceInYears(date1));
 
    }
}
