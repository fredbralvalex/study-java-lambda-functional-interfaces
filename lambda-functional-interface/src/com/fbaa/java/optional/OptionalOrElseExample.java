package com.fbaa.java.optional;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OptionalOrElseExample {

    //orElse
    public static String optionalOrElse() {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElse("Default");
        return name;
    }

    //orElseGet
    public static String optionalOrElseGet() {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseGet(() -> "Default");
        return name;
    }

    //orElseThrow
    public static String optionalOrElseThrow() {
//        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get());
        Optional<Student> studentOptional = Optional.ofNullable(null);
        String name = studentOptional.map(Student::getName).orElseThrow(() -> new RuntimeException("No data available."));
        return name;
    }
    public static void main(String[] args) {
        System.out.println("Or else: " + optionalOrElse());
        System.out.println("Or else get: " + optionalOrElseGet());
        System.out.println("Or else throw: " + optionalOrElseThrow());
    }
}
