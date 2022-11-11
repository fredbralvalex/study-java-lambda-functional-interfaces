package com.fbaa.java.functionalinterfaces;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class PredicateAndConsumerExample {

    Predicate<Student> predicateGrade = student -> student.getGradeLevel() >= 3;
    Predicate<Student> predicateGPA = student -> student.getGpa() >= 3.9;

    BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
    BiConsumer<String, List<String>> studentBiConsumer = (name, activities) -> System.out.println(name + " : " + activities);

    Consumer<Student> studentConsumer = student -> {
//        if(predicateGrade.and(predicateGPA).test(student)){
        if(biPredicate.test(student.getGradeLevel(),student.getGpa())){
            studentBiConsumer.accept(student.getName(), student.getActivities());
        }
    };

    public void printNameAndActivities(List<Student> studentList){
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
        new PredicateAndConsumerExample().printNameAndActivities(studentList);
    }
}
