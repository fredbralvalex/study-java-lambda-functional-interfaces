package com.fbaa.java.defaults;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class DefaultMethodsExample2 {

    static Consumer<Student> studentConsumer = (student -> System.out.println(student));
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);

    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);


    public static void sortByName(List<Student> studentList) {
        System.out.println("After name sort:");

        studentList.sort(nameComparator);
        studentList.forEach(studentConsumer);
    }

    public static void sortByGpa(List<Student> studentList) {
        System.out.println("After gpa sort:");
        Comparator<Student> gpaComparator = Comparator.comparing(Student::getGpa);

        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    public static void comparatorChain(List<Student> studentList) {
        System.out.println("After chain comparator sort:");

        studentList.sort(gradeComparator.thenComparing(nameComparator));
        studentList.forEach(studentConsumer);
    }

    public static void sortWithNullValues(List<Student> studentList) {
        System.out.println("After sort with null values:");

        Comparator<Student> studentComparator = Comparator.nullsFirst(nameComparator);
        studentList.sort(studentComparator);

        studentList.forEach(studentConsumer);

    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();

//        System.out.println(studentList);
        System.out.println("Before sort: ");
        studentList.forEach(studentConsumer);
//        sortByName(studentList);
//        sortByGpa(studentList);
//        comparatorChain(studentList);

        sortWithNullValues(studentList);
    }

}
