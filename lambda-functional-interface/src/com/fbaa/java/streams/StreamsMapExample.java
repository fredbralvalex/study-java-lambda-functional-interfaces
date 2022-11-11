package com.fbaa.java.streams;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsMapExample {

    public static List<String> namesList() {
        List<String> nameStudentList = StudentDataBase.getAllStudents().stream() //Stream <Student>
                //student as an input -> Student name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> Uppercase operation
                .collect(Collectors.toList());//List<String>
        return nameStudentList;
    }

    public static Set<String> namesSet() {
        Set<String> nameStudentList = StudentDataBase.getAllStudents().stream() //Stream <Student>
                //student as an input -> Student name
                .map(Student::getName) //Stream<String>
                .map(String::toUpperCase) //Stream<String> -> Uppercase operation
                .collect(Collectors.toSet());//Set<String>
        return nameStudentList;
    }

    public static void main(String[] args) {
        System.out.println(namesList());
        System.out.println(namesSet());
    }
}
