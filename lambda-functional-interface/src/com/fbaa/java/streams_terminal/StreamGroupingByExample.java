package com.fbaa.java.streams_terminal;

import com.fbaa.java.data.Student;
import com.fbaa.java.data.StudentDataBase;

import javax.swing.text.html.Option;
import java.util.*;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void groupStudentByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGender));

        System.out.println("Student Map" + studentMap);
    }

    public static void CustomizedGroupStudentByGender() {
        Map<String, List<Student>> studentMap = StudentDataBase.getAllStudents().stream() //Stream<Student>
                .collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE"));

        System.out.println("Customized Student Map" + studentMap);
    }

    public static void twoLevelGrouping_1() {
        Map<Integer, Map<String, List<Student>>> twoLevelMapping =
                StudentDataBase.getAllStudents().stream()
                        .collect(Collectors.groupingBy(Student::getGradeLevel,
                                Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));

        System.out.println("Two Level Grouping: " + twoLevelMapping);
    }

    public static void twoLevelGrouping_2() {
        Map<String, Integer> twoLevelMapping =
                StudentDataBase.getAllStudents().stream()
                        .collect(Collectors.groupingBy(Student::getName,
                                Collectors.summingInt(Student::getNoteBooks)));

        System.out.println("Two Level Grouping: " + twoLevelMapping);
    }

    public static void threeArgumentGroupingBy_1() {
        LinkedHashMap<String, Set<Student>> studentLinkedHashMap = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getName, LinkedHashMap::new, Collectors.toSet()));

        System.out.println("Three Argument Grouping By" + studentLinkedHashMap);
    }

    public static void calculateTopGpa() {
        Map<Integer, Optional<Student>> mapTopGpa = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.maxBy(Comparator.comparing(Student::getGpa))));

        System.out.println("Calculate Top GPA: " + mapTopGpa);

        Map<Integer, Student> mapTopGpaAndThen = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)), Optional::get)
                        ));

        System.out.println("Calculate Top GPA and then: " + mapTopGpaAndThen);
    }

    public static void calculateLeastGpa() {
        Map<Integer, Optional<Student>> mapTopGpa = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel, Collectors.minBy(Comparator.comparing(Student::getGpa))));

        System.out.println("Calculate Least GPA: " + mapTopGpa);

        Map<Integer, Student> mapTopGpaAndThen = StudentDataBase.getAllStudents().stream()
                .collect(Collectors.groupingBy(Student::getGradeLevel,
                        Collectors.collectingAndThen(Collectors.minBy(Comparator.comparing(Student::getGpa)), Optional::get)
                        ));

        System.out.println("Calculate Least GPA and then: " + mapTopGpaAndThen);
    }

    public static void main(String[] args) {
        groupStudentByGender();
        System.out.println();
        CustomizedGroupStudentByGender();
        System.out.println();
        twoLevelGrouping_1();
        System.out.println();
        twoLevelGrouping_2();
        System.out.println();
        threeArgumentGroupingBy_1();
        System.out.println();
        calculateTopGpa();
        System.out.println();
        calculateLeastGpa();
    }
}
