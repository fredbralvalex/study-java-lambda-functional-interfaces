package com.fbaa.java.streams_terminal;

import com.fbaa.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsCountingExample {

    public static long count(){
        return StudentDataBase.getAllStudents().stream()
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.counting());
    }

    public static void main(String[] args) {

        System.out.println("Count: "  + count());

    }
}
