package com.basic.oops.ClassesObjects;

public class Student_Object {
    public static void main(String[] args) {
        Student s = new Student();
        s.studentName = "Geetha";
        s.studentId = 101;
        s.studentCity = "Chennai";

        s.show();
        s.study();

    }
}
