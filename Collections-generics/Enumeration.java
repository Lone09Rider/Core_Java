package com.generics;

public class Enumeration {

    public enum Season { WINTER, SPRING, SUMMER, FALL }


    public static void main(String[] args) {
        for (Season s : Season.values())
        {
            System.out.println(s);
        }
    }
}
