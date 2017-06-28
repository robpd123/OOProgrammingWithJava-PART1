
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int montd, int year) {
        this.day = day;
        this.month = montd;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public int differenceInYears(MyDate comparedDate) {

        if (this.isNewer(comparedDate)) {
            return calculateDifference(this, comparedDate);
        }

        return calculateDifference(comparedDate, this);

    }

    public boolean isNewer(MyDate comparedDate) {

        System.out.println("This year: " + this.year);
        System.out.println("Compared year: " + comparedDate.year);

        if (this.year > comparedDate.year) {
            return true;
        } else if (this.year == comparedDate.year) {
            if (this.month > comparedDate.month) {
                return true;
            } else if (this.month == comparedDate.month) {
                if (this.day >= comparedDate.day) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;

    }

    public int calculateDifference(MyDate largerDate, MyDate smallerDate) {

        if (largerDate.month > smallerDate.month) {
            return largerDate.year - smallerDate.year;
        }
        if (largerDate.month == smallerDate.month && largerDate.day >= smallerDate.day) {
            return largerDate.year - smallerDate.year;
        }
        return largerDate.year - smallerDate.year - 1;
    }

}
