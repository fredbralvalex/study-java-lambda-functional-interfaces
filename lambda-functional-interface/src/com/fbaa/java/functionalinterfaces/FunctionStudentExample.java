package com.fbaa.java.functionalinterfaces;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class FunctionStudentExample {

    static Function<List<Student>, Map<String, Double>> studentFunction = students -> {
        Map<String, Double> studentGradeMap = new HashMap<>();

        students.forEach(student -> {
            if (PredicateStudentExample.predicate.test(student)) {
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });

        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(studentFunction.apply(StudentDataBase.getAllStudents()));
    }
}
