package com.fbaa.java.streams;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamExample {
    public static void main(String[] args) {
        //students and their activities in a map

        Predicate<Student> predicate = student -> student.getGradeLevel() >= 3;
        Predicate<Student> predicateGPA = student -> student.getGpa() >= 3.9;

        Map<String, List<String>> studentMap =
                StudentDataBase.getAllStudents().stream()
                        .peek(student -> {
                            System.out.println(student);
                            System.out.println("");
                        })
                        .filter(predicate)
                        .peek(student -> {
                            System.out.println("");
                            System.out.println("After 1st filter: " + student);
                        })
                        .filter(predicateGPA)
                        .peek(student -> {
                            System.out.println("");
                            System.out.println("After 2nd filter: " + student);
                        })
                        .collect(Collectors.toMap(Student::getName, Student::getActivities));

        System.out.println("END:");
        System.out.println(studentMap);
    }
}
