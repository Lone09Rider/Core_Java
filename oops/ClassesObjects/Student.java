package com.basic.oops.ClassesObjects;

class Student {
    // data:data members:instance variable
    int studentId;
    String studentName;
    String studentCity;

    // Behaviour : Member Methods :methods : functions
    public void study()
    {
        System.out.println(studentName+"is Studying");
    }

    public void show()
    {
        System.out.println("My name is "+studentName);
        System.out.println("My Id is "+studentId);
        System.out.println("I am From "+studentCity);
    }

}
