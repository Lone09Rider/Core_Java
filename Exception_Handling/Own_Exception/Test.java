package com.Exception_Handling.Own_Exception;

public class Test {
    public static void main(String[] args) {
//        Age_Invalid_Exception ex = new Age_Invalid_Exception("Invalid");
        int a;
        a = -10;
        try {
            if (a < 18) {
                throw new Age_Invalid_Exception("Your are Kid !!!");
            }
        } catch (Age_Invalid_Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("You got it !!!");
        }
    }
}
