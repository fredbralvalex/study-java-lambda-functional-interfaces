package com.fbaa.java.functionalinterfaces;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

public class BiFunctionExample {

    static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> biFunction = (students, predicate) -> {
      Map<String, Double> studentGradeMap = new HashMap<>();

      students.forEach(student -> {
          if(predicate.test(student)) {
              studentGradeMap.put(student.getName(), student.getGpa());
          }
      });
      return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.println(biFunction.apply(StudentDataBase.getAllStudents(), PredicateStudentExample.predicate1));
    }
}
