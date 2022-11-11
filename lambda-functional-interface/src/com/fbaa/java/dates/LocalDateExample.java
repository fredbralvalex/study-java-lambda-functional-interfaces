package com.fbaa.java.dates;

import java.time.LocalDate;
import java.time.temporal.*;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();

        System.out.println("localDate: " + localDate);

        LocalDate localDate1 = LocalDate.of(2022, 11, 1);
        System.out.println("localDate1: " + localDate1);

        LocalDate localDate2 = LocalDate.ofYearDay(2022, 365);
        System.out.println("localDate2: " + localDate2);

        /**
         * Get values from localDate
         */
        System.out.println("getMonth: " + localDate.getMonth());
        System.out.println("getMonthValue: " + localDate.getMonthValue());
        System.out.println("getDayOfWeek: " + localDate.getDayOfWeek());
        System.out.println("getDayOfYear: " + localDate.getDayOfYear());

        System.out.println("ChronoField.DAY_OF_MONTH get: " + localDate.get(ChronoField.DAY_OF_MONTH));

        /**
         * Modifying Local Date
         */
        System.out.println("plusDays: " + localDate.plusDays(2));
        System.out.println("plusMonths: " + localDate.plusMonths(2));
        System.out.println("minusDays: " + localDate.minusDays(2));
        System.out.println("withYear: " + localDate.withYear(2023));
        System.out.println("ChronoField.YEAR: " + localDate.with(ChronoField.YEAR, 2024));
        System.out.println("TemporalAdjusters.firstDayOfNextMonth: " + localDate.with(TemporalAdjusters.firstDayOfNextMonth()));

        System.out.println("minus ChronoUnit.YEARS: " + localDate.minus(1, ChronoUnit.YEARS));

        /**
         * Unsupported
         */
//        System.out.println("minus ChronoUnit.YEARS: " + localDate.minus(1, ChronoUnit.MINUTES));

        System.out.println("isSupported Minutes: " + localDate.isSupported(ChronoUnit.MINUTES));
        System.out.println("isSupported Years: " + localDate.isSupported(ChronoUnit.YEARS));

        /**
         * Additional support Methods
         */
        System.out.println("leapYear: " + localDate.ofYearDay(2020, 01).isLeapYear());
        System.out.println("leapYear: " + localDate.ofYearDay(2024, 01).isLeapYear());

        System.out.println("isEquals: " + localDate1.equals(localDate2));
        System.out.println("isBefore: " + localDate1.isBefore(localDate2));
        System.out.println("isAfter: " + localDate1.isAfter(localDate2));

    }
}
