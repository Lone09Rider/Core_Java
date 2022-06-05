package com.generics;
import java.util.*;

public class MoreCode
{
    public static void main(String[] args)
    {
        // Acts as set in Python so no duplicate values
        HashSet<Double> nums  = new HashSet<>();
        nums.add(12.12);
        nums.add(48.90);
        nums.add(48.90);
        // Wrapper class : Automatically Converts
        nums.add(new Double(14.95));
        nums.add(9.0);
        System.out.println(nums);


//         To Sort this :
        List<Double> sort_nums = new ArrayList<>(nums);
        Collections.sort(sort_nums);
        System.out.println(sort_nums);

        System.out.println("___________________");
//
//        Sorts the data automatically

        TreeSet<Double> t = new TreeSet<>();
        t.add(12.12);
        t.add(78.90);
        t.add(78.90);
        t.add(6.0);
        System.out.println(t);
    }

}
