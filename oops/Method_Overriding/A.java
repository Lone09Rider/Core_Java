package com.basic.oops.Method_Overriding;

public class A {
    protected void eat() {
        System.out.println("Eating");
    }
}

// public > protected > default > private

class B extends A {
    // Overriding Method
    @Override
//    public B eat()
    public void eat() {
        System.out.println("Eating Chicken and Rice");
    }
}
