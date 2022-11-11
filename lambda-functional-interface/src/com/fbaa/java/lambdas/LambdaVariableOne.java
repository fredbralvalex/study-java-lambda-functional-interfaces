package com.fbaa.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariableOne {
    public static void main(String[] args) {
        int i = 0;
        Consumer<Integer> c1 = i1 -> {
//            int i = 2;
            System.out.println(i1);
        };
    }
}
