package com.fbaa.java.methodreference;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.function.Consumer;

public class ConsumerMethodReferenceExample {

    static Consumer<Student> consumer = System.out::println;
    static Consumer<Student> consumer2 = Student::printListOfActivities;

    public static void main(String[] args) {
        StudentDataBase.getAllStudents().forEach(consumer);

        StudentDataBase.getAllStudents().forEach(consumer2);
    }
}
