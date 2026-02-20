
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class Solution1 {
    public static void main(String[] args) {
        // Problem 1: Time Zones and ZonedDateTime
        // Write a program that displays the current time in different time zones:
        // - GMT (Greenwich Mean Time)
        // - IST (Indian Standard Time)
        // - PST (Pacific Standard Time)

        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Current time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current time in IST: " + istTime.format(formatter));
        System.out.println("Current time in PST: " + pstTime.format(formatter));
    }
}
