package Utils;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class p050_LocalDate {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println("Today's date is " + localDate);
        LocalDate localDateZone = LocalDate.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Today date at zone America/Los_Angeles:" + localDateZone);
        LocalTime localTime = LocalTime.now();
        System.out.println("Time is :" + localTime);
        LocalTime localTimeZone = LocalTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Time in America is :" + localTimeZone);
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Locat Date time now is :"+localDateTime);
        LocalDateTime localDateTimeZone = LocalDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("Date time in America Los Angeles is :"+localDateTimeZone);
    }
}
