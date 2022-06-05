package com.basic.java;

public class For_Each {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i:nums) {
            sum += i;
            System.out.println(i*100);
        }
        System.out.println(sum);
    }
}
