package com.fbaa.java.streams;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

public class StreamMapReducerExample {

    private static int noOfNotebooks() {
        return StudentDataBase.getAllStudents().stream() // Stream<Student>
                .filter(student -> student.getGradeLevel() >= 3)
                .filter(student -> student.getGender().equals("female"))
                .map(Student::getNoteBooks) // Stream<Integer>
//                .reduce(0, (a,b)->a+b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("noOfNotebooks: " + noOfNotebooks());
    }
}
