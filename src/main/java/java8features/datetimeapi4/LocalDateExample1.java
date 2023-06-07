package java8features.datetimeapi4;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample1 {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Printing current date using LocalDate.now() -->" + localDate);

        LocalDate localDate1 = LocalDate.of(2015, 2, 20);
        System.out.println("Printing custom date using LocalDate.of() -->" + localDate1);

        LocalDate localDate2 = LocalDate.parse("2015-02-20");
        //LocalDate localDate2 = LocalDate.parse("20-02-2015"); // throws DateTimeParseException
        System.out.println("Printing custom date using LocalDate.parse() -->" + localDate2);

        LocalDate tomorrow = LocalDate.now().plusDays(1);
        System.out.println("Gets the current local date and adds one day -->" + tomorrow);

       /* Below example obtains the current date and subtracts one month.
          Observe it accepts an enum as the time unit.  */

        LocalDate previousMonthSameDay = LocalDate.now().minus(1, ChronoUnit.MONTHS);
        System.out.println("Gets the current local date and reduce one month --> " + previousMonthSameDay);

        DayOfWeek sunday = LocalDate.parse("2016-06-12").getDayOfWeek();
        System.out.println("Parse and get day of the week --> " + sunday);

        int twelve = LocalDate.parse("2016-06-12").getDayOfMonth();
        System.out.println("Parse and get day of Month --> " + twelve);

        boolean leapYear = LocalDate.now().isLeapYear();
        System.out.println("Is current year a leap year? -> " + leapYear);

        boolean notBefore = LocalDate.parse("2016-06-12")
                .isBefore(LocalDate.parse("2016-06-11"));
        System.out.println("Comparing  2 dates using isBefore -> " + notBefore);

        boolean isAfter = LocalDate.parse("2016-06-12")
                .isAfter(LocalDate.parse("2016-06-11"));

        System.out.println("Comparing  2 dates using isAfter -> " + isAfter);

        LocalDateTime beginningOfDay = LocalDate.parse("2016-06-12").atStartOfDay();
        System.out.println("Beginning of day using atStartOfDay()  " + beginningOfDay );

        LocalDate firstDayOfMonth = LocalDate.parse("2016-06-12")
                .with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("Adjusting day using firstDayOfMonth()  " + firstDayOfMonth );

    }
}
