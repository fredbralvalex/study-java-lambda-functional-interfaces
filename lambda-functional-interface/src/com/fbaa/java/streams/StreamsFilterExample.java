package com.fbaa.java.streams;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFilterExample {

    public static List<Student> filterStudents() {
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .filter(student -> student.getGender().equals("female")) // Stream<Student>
                //filter and sends only the students whose gender is female
                .filter(student -> student.getGpa() >= 3.9)
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
//        System.out.println("FilterStudents: " + filterStudents());
        filterStudents().forEach(System.out::println);
    }
}
