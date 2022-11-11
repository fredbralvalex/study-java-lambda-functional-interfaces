package com.fbaa.java.streams;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsCompatorExample {

    public static List<Student> sortStudentByName() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getName))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGPA() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa))
                .collect(Collectors.toList());
    }

    public static List<Student> sortStudentByGPADesc() {
        return StudentDataBase.getAllStudents().stream()
                .sorted(Comparator.comparing(Student::getGpa).reversed())
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        System.out.println("Student sorted by Name : ");
        sortStudentByName().forEach(System.out::println);

        System.out.println("Student sorted by GPA : ");
        sortStudentByGPA().forEach(System.out::println);

        System.out.println("Student sorted by GPA Desc : ");
        sortStudentByGPADesc().forEach(System.out::println);
    }
}
