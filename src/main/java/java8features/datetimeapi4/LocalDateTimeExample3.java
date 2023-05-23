package java8features.datetimeapi4;

import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeExample3 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        System.out.println("Printing current date and time using now() -->"+now);

        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 6, 30);
        System.out.println("Creating LocalDateTime using of() method --> " +localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.parse("2015-02-20T06:30:00");
        System.out.println("Creating LocalDateTime using parse() method --> " +localDateTime1);

        LocalDateTime addingOneDay = localDateTime1.plusDays(1);
        System.out.println("Adding one day -->"+ addingOneDay);

        LocalDateTime reducingTwoHours = localDateTime1.minusHours(2);
        System.out.println("Reducing 2 hours --> " +  reducingTwoHours);

        Month month = localDateTime1.getMonth();
        System.out.println("Getting month from Date Time --> "+ month);


    }
}
