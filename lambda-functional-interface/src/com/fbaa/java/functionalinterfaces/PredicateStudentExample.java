package com.fbaa.java.functionalinterfaces;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Predicate;

public class PredicateStudentExample {

    static Predicate<Student> predicate = student -> student.getGradeLevel() >= 3;
    static Predicate<Student> predicate1 = student -> student.getGpa() >= 3.9;

    public static void filterStudentByGradeLevel() {
        System.out.println("filterStudentByGradeLevel");

        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(predicate.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudentByGPA() {
        System.out.println("filterStudentByGPA: ");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(predicate1.test(student)){
                System.out.println(student);
            }
        });
    }
    public static void filterStudent() {
        System.out.println("filterStudent: ");
        List<Student> studentList = StudentDataBase.getAllStudents();

        studentList.forEach(student -> {
            if(predicate.or(predicate1).test(student)){
                System.out.println(student);
            }
        });
    }

    public static void main(String[] args) {
        filterStudentByGradeLevel();
        filterStudentByGPA();
        filterStudent();
    }
}
