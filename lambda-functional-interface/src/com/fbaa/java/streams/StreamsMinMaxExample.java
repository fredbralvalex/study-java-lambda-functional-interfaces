package com.fbaa.java.streams;

import javax.swing.text.html.Option;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {
    public static int findMaxValue(List<Integer> integerList) {
        return integerList.stream()
                //6 -> y // 7 -> y // 8 -> y // 9 -> y // 10 -> y
                // x variable holds the max value for each element in the iterator
                .reduce(0, (x, y) -> x > y ? x : y);
//                .reduce(0, Integer::max);
    }

    public static int findMinValue(List<Integer> integerList) {
        return integerList.stream()
                //6 -> y // 7 -> y // 8 -> y // 9 -> y // 10 -> y
                // x variable holds the max value for each element in the iterator
                .reduce(0, (x, y) -> x < y ? x : y);
//                .reduce(0, Integer::max);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> integerList) {
        return integerList.stream()
                //6 -> y // 7 -> y // 8 -> y // 9 -> y // 10 -> y
                // x variable holds the max value for each element in the iterator
                .reduce((x, y) -> x > y ? x : y);
//                .reduce(Integer::max);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> integerList) {
        return integerList.stream()
                //6 -> y // 7 -> y // 8 -> y // 9 -> y // 10 -> y
                // x variable holds the max value for each element in the iterator
                .reduce((x, y) -> x < y ? x : y);
//                .reduce(Integer::max);
    }

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);
        System.out.println("max value is: " + findMaxValue(integerList));
        Optional<Integer> optional = findMaxValueOptional(integerList);

        List<Integer> emptyList = new ArrayList<>();
        Optional<Integer> optional1 = findMaxValueOptional(emptyList);

        if (optional.isPresent()) {
            System.out.println("max value optional is: " + optional.get());
        } else {
            System.out.println("No max value found.");
        }
        if (optional1.isPresent()) {
            System.out.println("max value optional is: " + optional.get());
        } else {
            System.out.println("No max value found.");
        }
        System.out.println("min value is: " + findMinValue(integerList));

//        Optional<Integer> optionalMin = findMinValueOptional(integerList);
        Optional<Integer> optionalMin = findMinValueOptional(emptyList);
        if (optionalMin.isPresent()) {
            System.out.println("min value optional is: " + optionalMin.get());

        } else {
            System.out.println("No input passed.");
        }

    }
}
