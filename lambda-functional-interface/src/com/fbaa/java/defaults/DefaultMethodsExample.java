package com.fbaa.java.defaults;

import java.util.*;

public class DefaultMethodsExample {


    public static void main(String[] args) {
        /**
         * Sort the list names in alphabetical order
         */
        List<String> stringList = Arrays.asList("Adam", "Jenny", "Alex", "Dan", "Mike", "Eric");

        /**
         * Prior Java 8
         */
//        Collections.sort(stringList);
        System.out.println("Sorted List using Collections.sort(): " + stringList);

        /**
         * Java 8
         */
        stringList.sort(Comparator.naturalOrder());
        System.out.println("Sorted List using List.sort(): " + stringList);
        stringList.sort(Comparator.reverseOrder());
        System.out.println("Sorted List using List.sort() reverse: " + stringList);


    }
}
