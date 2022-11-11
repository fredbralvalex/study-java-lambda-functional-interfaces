package com.fbaa.java.functionalinterfaces;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {

    static Consumer<Student> consumer = student -> System.out.println(student);
    static Consumer<Student> consumerName = student -> System.out.print(student.getName());
    static Consumer<Student> consumerActivities = student -> System.out.println(student.getActivities());

    public static void printName() {
        System.out.println("printName: ");
        List<Student> studentList =  StudentDataBase.getAllStudents();
        studentList.forEach(consumer);
    }

    public static void printNameAndActivities() {
        System.out.println("printNameAndActivities: ");
        List<Student> studentList =  StudentDataBase.getAllStudents();
        studentList.forEach(consumerName.andThen(consumerActivities)); //consumer chain
    }
    public static void printNameAndActivitiesUsingCondition() {
        System.out.println("printNameAndActivitiesUsingCondition: ");
        List<Student> studentList =  StudentDataBase.getAllStudents();
        studentList.forEach(student -> {
            if (student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                consumerName.andThen(consumerActivities).accept(student);
            }
        }); //consumer chain
    }

    public static void main(String[] args) {

        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java 8");

        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();

    }
}
