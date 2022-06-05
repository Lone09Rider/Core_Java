package com.basic.java;

public class Typecasting {
    public static void main(String[] args) {
        int marks = 98;
        double d = 98.99;
        float f = 98.99f;
        char c = 'A';
        char ch = 97;
        byte b = 23;
        short s = 23;

        double dl = marks;
        System.out.println(dl);
        int i = c;
        System.out.println(i);
        short st = (short)marks;
        System.out.println(st);
    }
}
