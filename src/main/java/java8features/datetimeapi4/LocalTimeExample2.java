package java8features.datetimeapi4;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample2 {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println("Printing local time using LocalTime.now() ->  "+now);

        //LocalTime sixThirty = LocalTime.parse("6:30");// throws DateTimeParseException
        LocalTime sixThirty = LocalTime.parse("06:30");
        System.out.println("LocalTime representing 6:30 a.m. using parse() -> " + sixThirty);

        LocalTime sixThirty2 = LocalTime.of(6, 30);
        System.out.println("LocalTime representing 6:30 a.m. using of()> " + sixThirty2);

        LocalTime sevenThirty = LocalTime.parse("06:30").plus(1, ChronoUnit.HOURS);
        System.out.println("Adding 1 hour to 6:30 --> " +sevenThirty);

        int six = LocalTime.parse("06:30").getHour();
        System.out.println("Getting hour from time -> "+ six);

        int minute = LocalTime.parse("06:30").getMinute();
        System.out.println("Getting minute from time -> "+ minute);

        boolean isbefore = LocalTime.parse("06:30").isBefore(LocalTime.parse("07:30"));
        System.out.println("Comparing time using isBefore() method--> "+isbefore );

        /* Finally, the max, min and noon time of a day can be obtained by constants in LocalTime class.
        This is very useful when performing database queries to find records within a given span of time. */

        LocalTime maxTime = LocalTime.MAX;
        System.out.println("Max time -->" +maxTime );

        LocalTime minTime = LocalTime.MIN;
        System.out.println("Min time -->" +minTime );

        LocalTime midNight = LocalTime.MIDNIGHT;
        System.out.println("Mid Night-->" +midNight );

    }
}
