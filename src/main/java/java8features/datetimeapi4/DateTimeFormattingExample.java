package java8features.datetimeapi4;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormattingExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30);
        String localDateString = localDateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Formatted local data and Time--> " + localDateString);

        String format = localDateTime.format(DateTimeFormatter.ofPattern("yyyy/MM/dd"));
        System.out.println("Formatted date with pattern yyyy/MM/dd --> " + format);

        String format1 = localDateTime
                .format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM)
                        .withLocale(Locale.UK));
        System.out.println("Formatted date with Inbuilt pattern --> " + format1);
    }
}


/*  Ref --> https://www.baeldung.com/java-8-date-time-intro   */
