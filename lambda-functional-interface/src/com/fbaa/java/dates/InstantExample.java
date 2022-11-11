package com.fbaa.java.dates;

import java.time.Duration;
import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);
        // Jan 1st 1970 - > Epoch -> 86400 seconds
        System.out.println("getEpochSeconds: " + instant.getEpochSecond());

        System.out.println("getEpochSeconds 0 : " + instant.ofEpochSecond(0));

        Instant instant1 = Instant.now();

        Duration duration = Duration.between(instant, instant1);
        System.out.println( "Diff: " + duration.toNanos());

    }
}
