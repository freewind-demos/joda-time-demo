package my;

import org.joda.time.DateTime;

public class DateComparisonDemo {

    public static void main(String[] args) {
        DateTime dateTime = new DateTime();
        DateTime dateTime2 = new DateTime();
        System.out.println(isSameDay(dateTime, dateTime2));
    }

    private static boolean isSameDay(DateTime dateTime, DateTime dateTime2) {
        return dateTime.withTimeAtStartOfDay().isEqual(dateTime2.withTimeAtStartOfDay());
    }

}
