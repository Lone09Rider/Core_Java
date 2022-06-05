package com.basic.oops.Constructor;

class Constructor_Student {
    // data:data members:instance variable
    int studentId;
    String studentName;
    String studentCity;

    // Constructor
    // 1. Non Parameterized
    public Constructor_Student()
    {
        System.out.println("Creating Object");
    }

    // Parameterized
    // By Constructor Overloading
    public Constructor_Student(int id, String name, String city)
    {
        System.out.println("My name is "+name);
        System.out.println("My Id is "+id);
        System.out.println("I am From "+city);
    }



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
