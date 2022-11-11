package com.fbaa.java.streams_terminal;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.stream.Collectors;

public class StreamsJoiningExample {

    public static String joining_1(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //Stream <String>
                .collect(Collectors.joining());
    }
    public static String joining_2(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //Stream <String>
                .collect(Collectors.joining("-"));
    }

    public static String joining_3(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getName) //Stream <String>
                .collect(Collectors.joining("-", "(", ")"));
    }

    public static void main(String[] args) {
        System.out.println("Joining 1: " + joining_1());
        System.out.println("Joining 2: " + joining_2());
        System.out.println("Joining 3: " + joining_3());
    }
}
