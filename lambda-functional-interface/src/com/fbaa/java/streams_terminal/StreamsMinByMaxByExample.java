package com.fbaa.java.streams_terminal;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamsMinByMaxByExample {

    public static Optional<Student> minBy(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
    }

    public static Optional<Student> maxBy(){
        return StudentDataBase.getAllStudents().stream()
                .collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
    }

    public static void main(String[] args) {
        System.out.println("Min By: " + minBy());
        System.out.println("Max By: " + maxBy());
    }
}
