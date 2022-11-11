package com.fbaa.java.functionalinterfaces;

public class FunctionExampleOne {

    public static String performConcat(String str) {
        return FunctionExample.addSomeString.apply(str);
    }

    public static void main(String[] args) {
        String result = performConcat("Hello");
        System.out.println("Result is: " + result);
    }
}
