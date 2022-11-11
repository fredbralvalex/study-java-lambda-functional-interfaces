package com.fbaa.java.streams_terminal;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsSumAvarageExample {

    public static int sum() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.summingInt(Student::getNoteBooks));
    }
    public static double average() {
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.averagingInt(Student::getNoteBooks));
    }

    public static void main(String[] args) {
        System.out.println("Total no. of Notebooks: " + sum());
        System.out.println("Average no. of Notebooks: " + average());
    }
}
