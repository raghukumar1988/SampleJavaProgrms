package java8features.datetimeapi4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PeriodAndDurationExample5 {
    public static void main(String[] args) {
        LocalDate initialDate = LocalDate.parse("2007-05-10");
        LocalDate finalDate = initialDate.plus(Period.ofDays(5));
        System.out.println("Final date with plus() with Periods -->" + finalDate);

        int five = Period.between(initialDate, finalDate).getDays();
        System.out.println("Period.between() initialDate and finalDate -->"  + five );


        long five2 = ChronoUnit.DAYS.between(initialDate, finalDate);
        System.out.println("Period.between() initialDate and finalDate using ChronoUnit.between() -->"  + five2 );


        System.out.println("#####################################################");


        LocalTime initialTime = LocalTime.of(6, 30, 0);
        LocalTime finalTime = initialTime.plus(Duration.ofSeconds(30));
        System.out.println("Final time with plus() with Duration -->" + finalTime);


        long thirty = Duration.between(initialTime, finalTime).getSeconds();
        System.out.println("Duration.between() initialTime and finalTime -->"  + thirty );

        long thirty2 = ChronoUnit.SECONDS.between(initialTime, finalTime);
        System.out.println("Period.between() initialTime and finalTime using ChronoUnit.between() -->"  + thirty2 );


    }
}
