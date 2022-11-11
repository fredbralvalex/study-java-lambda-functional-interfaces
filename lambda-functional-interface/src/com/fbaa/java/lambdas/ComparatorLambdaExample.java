package com.fbaa.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        /**
         * prior java 8
         */
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        System.out.println("Result of the comparator is: " + comparator.compare(3,2));

        /**
         * with java 8
         */
        Comparator<Integer> comparatorLambda = (Integer a, Integer b) -> { return a.compareTo(b);};

        System.out.println("Result of the comparator using Lambda is: " + comparatorLambda.compare(3,2));

        Comparator<Integer> comparatorLambda1 = (a, b) -> a.compareTo(b);

        System.out.println("Result of the comparator using Lambda 1 is: " + comparatorLambda1.compare(3,2));

    }
}
