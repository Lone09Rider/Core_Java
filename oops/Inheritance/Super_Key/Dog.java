package com.basic.oops.Inheritance.Super_Key;

public class Dog extends Animal {
    int x = 4;
    public void name()
    {
        System.out.println("I am Dog");
    }
    public void speak()
    {
        System.out.println(super.x); // Refers Parent
        System.out.println(this.x); // Refers the current
    }
}
