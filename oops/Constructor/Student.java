package com.basic.oops.Constructor;

public class Student {
    public static void main(String[] args) {

        // 1. NON PARAMETERIZED CONSTRUCTOR

        Constructor_Student s1 = new Constructor_Student();
        s1.studentName = "Geeta";
        s1.studentId = 102;
        s1.studentCity = "Chennai";
        s1.show();

        // PARAMETERIZED CONSTRUCTOR
        Constructor_Student s2 = new Constructor_Student(1, "Golu", "Rajasthan");

    }
}
