package com.fbaa.java.dates;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimesDurationExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.of(7,20);
        LocalTime localTime1 = LocalTime.of(8,20);

        long diff = localTime.until(localTime1, ChronoUnit.MINUTES);
        System.out.println("Diff: " + diff);

        Duration duration = Duration.between(localTime, localTime1);
        System.out.println("toMinutes: " + duration.toMinutes());

        Duration duration1 = Duration.ofHours(3);
        System.out.println("toMinutes: " + duration1.toMinutes());

        Duration duration2 = Duration.ofMinutes(3);
        System.out.println("toMinutes: " + duration2.toMinutes());

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now().plusDays(10);

//        Duration duration3 = Duration.between(localDate, localDate1);

    }
}
