package com.fbaa.java.functionalinterfaces;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Student> studentSupplier = () ->
                new Student("Adam", 2, 4.0, "male", Arrays.asList("swimming", "basketball", "volleyball"));

        Supplier<List<Student>> listSupplier = () -> StudentDataBase.getAllStudents();
        System.out.println("Student is: " + studentSupplier.get());
        System.out.println("Students are: " + listSupplier.get());
    }
}
