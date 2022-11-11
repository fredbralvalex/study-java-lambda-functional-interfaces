package com.fbaa.java.functionalinterfaces;

import java.util.function.Predicate;

public class PredicateExample {
    static Predicate<Integer> predicate = i -> i % 2 == 0;

    static Predicate<Integer> predicate2 = i -> i % 5 == 0;

    public static void predicateAnd() {
        System.out.println("Predicate and result is:" +predicate.and(predicate2).test(10));
        System.out.println("Predicate and result is:" +predicate.and(predicate2).test(9));
    }
    public static void predicateOr() {
        System.out.println("Predicate or result is:" +predicate.or(predicate2).test(10));
        System.out.println("Predicate or result is:" +predicate.or(predicate2).test(8));
    }

    public static void predicateNegate() {
        System.out.println("Predicate negate or result is:" +predicate.or(predicate2).negate().test(10));
        System.out.println("Predicate negate or result is:" +predicate.or(predicate2).negate().test(8));
    }

    public static void main(String[] args) {
        System.out.println(predicate.test(4));
        predicateAnd();
        predicateOr();
        predicateNegate();
    }
}
