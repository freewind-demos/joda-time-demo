package my;

import org.joda.time.DateTime;

public class DateComparisonDemo {

    public static void main(String[] args) {
        checkSameDay();
        checkSameMonth();
    }

    private static void checkSameDay() {
        DateTime dateTime = new DateTime();
        DateTime dateTime2 = new DateTime();
        System.out.println(dateTime.withTimeAtStartOfDay().isEqual(dateTime2.withTimeAtStartOfDay()));
    }

    private static void checkSameMonth() {
        DateTime dateTime = new DateTime();
        DateTime dateTime2 = new DateTime();
        System.out.println(dateTime.withDayOfMonth(0).isEqual(dateTime2.withDayOfMonth(0)));
    }

}
