package com.fbaa.java.optional;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalExample {

    public static String getStudentName() {
//        Student student = StudentDataBase.studentSupplier.get();
        Student student = null;

        if (student != null) {
            return student.getName();
        }

        return null;
    }

    public static Optional<String> getStudentNameOptional() {

//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);

        if (studentOptional.isPresent()) {
            return studentOptional.map(Student::getName);
        }

        return Optional.empty(); // optional object with no value
    }

    public static void main(String[] args) {
        String name = getStudentName();
        if (name != null)
            System.out.println("Length of the student name: " + name.length());
        else
            System.out.println("Name not Found!");
        System.out.println();
        Optional<String> stringOptional = getStudentNameOptional();
        if (stringOptional.isPresent())
            System.out.println("Length of the optional student name: " + stringOptional.get().length());
        else
            System.out.println("Name not Found!");
    }
}
