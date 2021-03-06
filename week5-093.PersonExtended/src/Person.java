
import java.util.Calendar;

public class Person {

    private String name;
    private MyDate birthday;

    public Person(String name, int dd, int mm, int yy) {
        this.name = name;
        this.birthday = new MyDate(dd, mm, yy);
    }

    public Person(String name, MyDate birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public Person(String name) {
        this.name = name;
        int day, month, year;
        day = Calendar.getInstance().get(Calendar.DATE);
        month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        year = Calendar.getInstance().get(Calendar.YEAR);
        this.birthday = new MyDate(day, month, year);
    }

    public int age() {
// calculate the age based on the birthday and the current day
        // you get the current day as follows: 
        // Calendar.getInstance().get(Calendar.DATE);
        // Calendar.getInstance().get(Calendar.MONTH) + 1; // January is 0 so we add one
        // Calendar.getInstance().get(Calendar.YEAR);
        int day, month, year;
        day = Calendar.getInstance().get(Calendar.DATE);
        month = Calendar.getInstance().get(Calendar.MONTH) + 1;
        year = Calendar.getInstance().get(Calendar.YEAR);

        MyDate currentDate = new MyDate(day, month, year);

        return birthday.differenceInYears(currentDate);
    }

    public boolean olderThan(Person compared) {
        // compare the ages based on 
        if (birthday.earlier(compared.birthday)) {
            return true;
        }
        return false;

    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name + ", born " + this.birthday;
    }
}
