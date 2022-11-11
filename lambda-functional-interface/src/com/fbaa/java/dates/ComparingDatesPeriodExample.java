package com.fbaa.java.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class ComparingDatesPeriodExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 01,01);
        LocalDate localDate1 = LocalDate.of(2023, 12,31);

        /**
         *
         */
        Period period = localDate.until(localDate1);
        System.out.println("Period: " + period.getDays()); // result is 30 -> performs 31 -1
        System.out.println("getMonths: " + period.getMonths()); // performs 12-1
        System.out.println("getYears: " + period.getYears());

        Period period1 = Period.ofDays(10);
        System.out.println("getDays: " + period1.getDays());

        Period period2 = Period.ofYears(10);
        System.out.println("toTotalMonths: " + period2.toTotalMonths());

        Period period3 = Period.between(localDate, localDate1);
        System.out.println("period: " + period3.getDays() + " : " + period3.getMonths()
         + " : " + period3.getYears());

//        Period.between(LocalTime.now(), LocalTime.now().plusHours(24));
//        period3.get
    }
}
