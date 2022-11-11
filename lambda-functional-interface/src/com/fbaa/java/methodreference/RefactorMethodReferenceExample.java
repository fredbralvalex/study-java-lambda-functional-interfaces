package com.fbaa.java.methodreference;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.function.Predicate;

public class RefactorMethodReferenceExample {
    static Predicate<Student> predicate = RefactorMethodReferenceExample::greaterThanGradeLevel;

    public static boolean greaterThanGradeLevel (Student s) {
        return s.getGradeLevel() >= 3;
    }

    public static void main(String[] args) {
        System.out.println(predicate.test(StudentDataBase.studentSupplier.get()));
    }
}
