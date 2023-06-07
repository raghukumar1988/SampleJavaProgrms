package java8features.datetimeapi4;

import java.time.*;
import java.util.Set;

public class ZonedDateTimeExample4 {
    public static void main(String[] args) {
        /* Java 8 provides ZonedDateTime when we need to deal with time-zone-specific date and time.
           The ZoneId is an identifier used to represent different zones.
           There are about 40 different time zones, and the ZoneId represents them as follows.*/

        ZoneId zoneId = ZoneId.of("Europe/Paris");
        System.out.println("Zone Id of Europe/Paris -->" + zoneId);

        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();
        allZoneIds.stream()
                        .limit(10)
                                .forEach(zoneId2 -> System.out.println(" Printing 10 zone ids -->" +zoneId2));
       // Below prints long list of zoneIds
       // allZoneIds.forEach(zoneId2 -> System.out.println(" Printing all zone ids -->" +zoneId2));

        LocalDateTime localDateTime = LocalDateTime.of(2015, Month.FEBRUARY, 20, 6, 30);
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);
        System.out.println("Get ZonedDateTime from LocalDateTime using of() --> "+ zonedDateTime);

        ZonedDateTime zonedDateTime1 = ZonedDateTime.parse("2015-05-03T10:15:30+01:00[Europe/Paris]");
        System.out.println("Get ZonedDateTime  using parse() --> "+ zonedDateTime);

        ZoneOffset offset = ZoneOffset.of("+02:00");
        System.out.println("Printing offset -->" + offset);

        OffsetDateTime offSetByTwo = OffsetDateTime.of(localDateTime, offset);
        System.out.println("Offset by two ---> "+ offSetByTwo );

    }
}
