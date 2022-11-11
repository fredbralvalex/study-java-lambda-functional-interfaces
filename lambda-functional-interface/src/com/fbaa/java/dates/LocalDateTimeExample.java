package com.fbaa.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("localDateTime: " + localDateTime);

        LocalDateTime localDateTime1 = LocalDateTime.of(2018, 03, 21, 23,
                33, 33, 978);
        System.out.println("localDateTime1: " + localDateTime1);

        LocalDateTime localDateTime2 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        System.out.println("localDateTime2: " + localDateTime2);

        /**
         * Getting the time and date from localDateTime instance
         */
        System.out.println("getHour: " +localDateTime.getHour());
        System.out.println("getMinute: " +localDateTime.getMinute());
        System.out.println("ChronoField.DAY_OF_MONTH: " +localDateTime.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying localDateTime
         */
        System.out.println("plusHours: " + localDateTime.plusHours(2));
        System.out.println("minusDays: " + localDateTime.minusDays(2));
        System.out.println("withMonth: " + localDateTime.withMonth(7));

        /**
         * Converting localdate, localTime to localDateTime and viceversa
         */
        LocalDate localDate = LocalDate.of(2023, 01, 01);
        System.out.println("Local date at time: " + localDate.atTime(23,40));

        LocalTime localTime = LocalTime.of(23, 39);
        System.out.println("Local Time at date: " + localTime.atDate(localDate));

        LocalDateTime localDateTime3 = localTime.atDate(localDate);
        System.out.println("toLocalDate: " + localDateTime3.toLocalDate());
        System.out.println("toLocalTime: " + localDateTime3.toLocalTime());
    }
}
