package com.fbaa.java.streams;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamRedudeExample {

    public static int performMultiplication(List<Integer> integerList) {
        return integerList.stream()
                // 1, 3, 5, 7
                // a=1, b=1 (from stream) => result 1 is return
                // a=1, b=3 (from stream) => result 3 is return
                // a=3, b=5 (from stream) => result 15 is return
                // a=15, b=7 (from stream) => result 105 is return
                .reduce(1, (a, b) -> a * b);
    }

    public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
        return integerList.stream()
                // 1, 3, 5, 7
                // a=1, b=1 (from stream) => result 1 is return
                // a=1, b=3 (from stream) => result 3 is return
                // a=3, b=5 (from stream) => result 15 is return
                // a=15, b=7 (from stream) => result 105 is return
                .reduce((a, b) -> a * b);
    }

    public static Optional<Student> getHighestGPAStudent() {
        return StudentDataBase.getAllStudents().stream()
                //student one by one
                .reduce((s1, s2)-> s1.getGpa() > s2.getGpa() ? s1: s2);

//                .reduce((s1, s2) -> {
//                    if (s1.getGpa() > s2.getGpa()) {
//                        return s1;
//                    } else {
//                        return s2;
//                    }
//                });
    }

    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 3, 5, 7);
        List<Integer> integers1 = new ArrayList<>();
        System.out.println(performMultiplication(integers));
        Optional<Integer> optional = performMultiplicationWithoutIdentity(integers);
        Optional<Integer> optional1 = performMultiplicationWithoutIdentity(integers1);

        System.out.println(optional.isPresent());
        System.out.println(optional.get());

        System.out.println(optional1.isPresent());
        if (optional1.isPresent()) {
            System.out.println(optional1.get());
        }

        Optional<Student> optional2 = getHighestGPAStudent();
        if (optional2.isPresent()) {

            System.out.println(optional2.get());
        }

    }
}
