package my;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class DateTimeFormatDemo {

    public static void main(String[] args) {
        formatAsDate();
        formatAsDateTime();
    }

    private static void formatAsDate() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd");
        String date = formatter.print(new DateTime());
        System.out.println(date);
    }

    private static void formatAsDateTime() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss SSS");
        String date = formatter.print(new DateTime());
        System.out.println(date);
    }

}
