package com.fbaa.java.parallelstream;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample1 {

    public static List<String> sequentialPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();

        System.out.println("Duration to execute the pipeline in sequential: " + (endTime - startTime));
        return studentActivities;
    }

    public static List<String> parallelPrintStudentActivities() {
        long startTime = System.currentTimeMillis();
        List<String> studentActivities = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .parallel()
                .map(Student::getActivities) //Stream<List<String>>
                .flatMap(List::stream) //Stream<String>
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();

        System.out.println("Duration to execute the pipeline in parallel: " + (endTime - startTime));
        return studentActivities;
    }

    public static void main(String[] args) {
        sequentialPrintStudentActivities();
        parallelPrintStudentActivities();
    }
}
