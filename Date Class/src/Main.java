import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Date actualDate = new Date();
        System.out.println("Actual Date: " + actualDate);

        // Date(int year, int month, int date)
        // Creates a date object representing the given year, month, and day.
        // The month is 0-based, meaning that January = 0 and December = 11.
        // The day is 1-based, meaning that the first day of the month = 1.
        // The year is the year minus 1900.
        Date date = new Date(123, 9, 10);
        System.out.println("Next Birthday Date: " + date);

    }
}
