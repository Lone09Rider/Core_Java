package com.basic.oops.Polymorphism;

public class Compile_Time_MethodOverloading {

    // 1 parameter
    void show(int num1)
    {
        System.out.println("number 1 : " + num1);
    }

    // 2 parameter
    void show(int num1, int num2)
    {
        System.out.println("number 1 : " + num1
                + "  number 2 : " + num2);
    }

    public static void main(String[] args)
    {
        Compile_Time_MethodOverloading obj = new Compile_Time_MethodOverloading();
        obj.show(1);
        obj.show(2, 3);
    }
}