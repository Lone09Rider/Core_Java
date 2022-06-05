package com.Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            System.out.println("We Got two numbers");
            double result = n1 / n2;
            System.out.println("Division is : " + result);
        } catch (NumberFormatException e)
        {
            System.out.println("Cannot be Divided by Zero");
        } catch (InputMismatchException i)
        {
            System.out.println("Enter a number /Integer or floating point number");
        } finally {
            System.out.println("Terminated");
        }
    }
}
