package com.fbaa.java.optional;

import java.util.Optional;

public class OptionalPresentExample {

    public static void main(String[] args) {
        //is present
        Optional<String> optional = Optional.ofNullable("Hello optional");
        System.out.println(optional.isPresent());
        if (optional.isPresent()) {
            System.out.println(optional.get());
        }
        //if present
        optional.ifPresent(s -> System.out.println(s));
    }
}
