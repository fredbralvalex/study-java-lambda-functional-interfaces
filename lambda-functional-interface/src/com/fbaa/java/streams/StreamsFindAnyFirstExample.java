package com.fbaa.java.streams;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.Optional;

public class StreamsFindAnyFirstExample {

    public static Optional<Student> findAnyStudent() {
        return StudentDataBase.getAllStudents().stream()
                //Adam, Jenny, Emily
                .filter(student -> student.getGpa() >= 3.9)
                .findAny();
    }

    public static Optional<Student> findFirstStudent() {
        return StudentDataBase.getAllStudents().stream()
                //Adam, Jenny, Emily
                .filter(student -> student.getGpa() >= 4.0)
                .findFirst();
    }

    public static void main(String[] args) {
        Optional<Student> optionalFindAny = findAnyStudent();
        if (optionalFindAny.isPresent()) {
            System.out.println("Found the student: " + optionalFindAny.get());
        } else {
            System.out.println("Student not found.");
        }

        Optional<Student> optionalFindFirst = findFirstStudent();
        if (optionalFindFirst.isPresent()) {
            System.out.println("Found the student: " + optionalFindFirst.get());
        } else {
            System.out.println("Student not found.");
        }
    }
}
