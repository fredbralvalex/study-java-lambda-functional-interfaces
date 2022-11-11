package com.fbaa.java.streams_terminal;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamsPartitioningByExample {

    public static void partitioningBy_1() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, List<Student>> partitioningBy = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate));
        System.out.println("Partitioning by 1: " + partitioningBy);
    }
    public static void partitioningBy_2() {

        Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
        Map<Boolean, Set<Student>> partitioningBy = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));
        System.out.println("Partitioning by 2: " + partitioningBy);
    }

    public static void main(String[] args) {
        partitioningBy_1();
        System.out.println();
        partitioningBy_2();
    }
}
