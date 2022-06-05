package com.basic.java;

import java.util.Scanner;

public class Switch_Case {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        switch (x)
        {
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println(1);
                break;
            case 2:
                System.out.println(2);
        }
    }
}
