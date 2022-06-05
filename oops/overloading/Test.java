package com.basic.oops.overloading;

public class Test {
    public static void main(String[] args) {
        Constructor_overload_Student s = new Constructor_overload_Student();
        Constructor_overload_Student s1 = new Constructor_overload_Student("Raju");

        Method_Overload m = new Method_Overload();
        m.eat();
        m.eat("Butter");
    }
}
