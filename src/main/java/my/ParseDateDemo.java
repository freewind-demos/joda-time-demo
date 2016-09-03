package my;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class ParseDateDemo {

    public static void main(String[] args) {
        parseDateTime();
    }

    private static void parseDateTime() {
        DateTimeFormatter formatter = DateTimeFormat.forPattern("yyyy-MM-dd HH:mm:ss");
        DateTime date = formatter.parseDateTime("2016-12-03 21:34:01");
        System.out.println(date);
    }

}
