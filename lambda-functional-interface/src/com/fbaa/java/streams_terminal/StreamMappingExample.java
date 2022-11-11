package com.fbaa.java.streams_terminal;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamMappingExample {

    public static void main(String[] args) {
        List<String> nameList = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toList()));
        System.out.println("Name List is: " + nameList);

        Set<String> nameSet = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.mapping(Student::getName, Collectors.toSet()));

//        StudentDataBase.getAllStudents().stream()
//                .map(Student::getName)
//                .collect(Collectors.toSet());

        System.out.println("Name Set is: " + nameSet);
    }
}
