package com.fbaa.java.functionalinterfaces;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = str -> str.concat(" Default");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("Java 8"));
    }
}
