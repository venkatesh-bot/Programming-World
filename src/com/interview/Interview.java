package com.interview;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Interview {

    private static List<Student> studentList = new ArrayList<>();

    public static void main(String[] args) { {

        Student student1 = new Student("venky", "g");
        Student student2 = new Student("venky", "a");
        Student student3 = new Student("sadak", "sadak");
        Student student4 = new Student("sadak", "a");
        Student student5 = new Student("Venu", "a");

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);


        //Comparator<Student> compare = Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName);
        System.out.println(studentList);
        studentList = studentList.stream().sorted(Comparator.comparing(Student::getFirstName).thenComparing(Student::getLastName)).collect(Collectors.toList());
        //Collections.sort(studentList, compare);
        System.out.println(studentList);
    }
    }
}
