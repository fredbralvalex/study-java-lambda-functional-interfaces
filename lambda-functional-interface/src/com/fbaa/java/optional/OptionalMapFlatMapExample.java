package com.fbaa.java.optional;

import com.fbaa.java.data.Bike;
import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.Optional;

public class OptionalMapFlatMapExample {
    //filter
    public static void optionalFilter() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>

        studentOptional
                .filter(student -> student.getGpa() >= 4.5)
                .ifPresent(student -> System.out.println(student));
    }

    //map
    public static void optionalMap() {
        Optional<Student> studentOptional = Optional.ofNullable(StudentDataBase.studentSupplier.get()); //Optional<Student>
        if (studentOptional.isPresent()) {
            Optional<String> stringOptional = studentOptional
                    .filter(student -> student.getGpa() >= 3.5)
                    .map(Student::getName);
            System.out.println(stringOptional.get());
        }
    }

    //flatMap
    public static void optionalFlatMap() {
        Optional<Student> studentOptional = StudentDataBase.getOptionalStudent(); // Optional <Student>

        Optional<String> name = studentOptional
                .filter(student -> student.getGpa() >= 3.5)
                .flatMap(Student::getBike)// Optional<Bike>
                .map(Bike::getName);

        if (name.isPresent()) {
            System.out.println("name: " + name.get());
        }
    }

    public static void main(String[] args) {
        optionalFilter();
        optionalMap();
        optionalFlatMap();
    }
}
