package com.fbaa.java.streams;

import com.fbaa.java.data.StudentDataBase;

public class StreamsMatchExample {

    public static boolean allMatch() {
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGpa() >= 3.5);
    }

    public static boolean anyMatch() {
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGpa() >= 4.0);
    }

    public static boolean noneMatch() {
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGpa() >= 4.0);
    }

    public static void main(String[] args) {
        System.out.println("Result of AllMatch: " + allMatch());
        System.out.println("Result of AnyMatch: " + anyMatch());
        System.out.println("Result of NoneMatch: " + noneMatch());
    }
}
