package my;

import org.joda.time.DateTime;
import org.joda.time.Period;

public class DateDiffDemo {

    public static void main(String[] args) {
        plusDays();
    }

    private static void plusDays() {
        DateTime now = new DateTime();
        DateTime future1000 = now.plus(Period.days(1000));
        System.out.println("Now: " + now.toString("yyyy-MM-dd"));
        System.out.println("Future: " + future1000.toString("yyyy-MM-dd"));
    }

}
