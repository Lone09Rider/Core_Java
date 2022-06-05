package com.basic.java;

public class nested_if {
    public static void main(String[] args) {
        int x = 100;
        if (x >= 100)
        {
           if (x%2 == 0) {
               System.out.println("Even-2 Divisible");
           } if (x % 50 == 0) {
            System.out.println("Even and 50 Divisible");
        }
        }
    }
}
