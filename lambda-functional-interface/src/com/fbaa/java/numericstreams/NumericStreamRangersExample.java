package com.fbaa.java.numericstreams;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangersExample {
    public static void main(String[] args) {
        IntStream intStream = IntStream.range(1, 50);
        System.out.println(intStream.count());

        System.out.println("Range count");
        IntStream.range(1, 50).forEach(value -> System.out.print(value + ","));
        System.out.println();
        System.out.println("Range Closed count");
        IntStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));
        System.out.println();
        System.out.println("Long Range Closed count");
        LongStream.rangeClosed(1, 50).forEach(value -> System.out.print(value + ","));
        System.out.println();
        System.out.println("Double Range Closed count");
        IntStream.range(1,50).asDoubleStream().forEach(value -> System.out.print(value + ","));
    }
}
