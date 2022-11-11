package com.fbaa.java.streams;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsFlatMapExample {

    public static List<String> printStudentActivities () {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static List<String> printStudentUniqueActivities () {
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct() // Stream<String> -> with distinct function performed
                .sorted()
                .collect(Collectors.toList());
        return studentActivities;
    }

    public static Long getStudentActivitiesCount () {
        Long noOfstudentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .distinct()// Stream<String> -> with distinct function performed
                .count();// total number
        return noOfstudentActivities;
    }

    public static void main(String[] args) {
        System.out.println("Student activities: " + printStudentActivities());
        System.out.println("Student distinct activities: " + printStudentUniqueActivities());
        System.out.println("Student activities count: " + getStudentActivitiesCount());
    }
}
