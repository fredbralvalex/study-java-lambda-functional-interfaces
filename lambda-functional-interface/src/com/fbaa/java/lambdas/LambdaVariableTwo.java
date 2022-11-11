package com.fbaa.java.lambdas;

import java.util.function.Consumer;

public class LambdaVariableTwo {
    public static void main(String[] args) {
        int value = 4;

        Consumer<Integer> consumer = i -> {
//            value++;
            System.out.println(value+1);
        };

        consumer.accept(4);
    }

}
