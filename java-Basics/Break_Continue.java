package com.basic.java;

public class Break_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            System.out.println(i);
            if (i==5) {
                continue;
            }

            if (i == 10){
                break;
            }
        }
    }
}
