package com.generics;
import java.util.*;

public class StartCode {
    public static void main(String[] args) {
        System.out.println("Welcome to Collection Framework");

        /*
        * Creating Collection
        * 1 Type Safe : same types of elements are added
        * 2 UnType Safe : different types of elements are added */

//        Type Safe:
        ArrayList<Integer> num= new ArrayList<>();
        num.add(9);
        num.add(87);
//        num.add("Hello"); Error Because Not Integer
        num.add(59);
        System.out.println(num);
        System.out.println(num.get(0));
        num.remove(1);
        System.out.println(num);
        System.out.println(num.size());
        System.out.println(num.contains(9));
        System.out.println(num.isEmpty());
        num.add(0, 2);

        System.out.println("Changing and setting value");
        num.set(0, 3);
        System.out.println(num);

        int sum = 0;
        for (int i:num) {
            sum += i;
        }
        System.out.println(sum);


        Vector<Integer> v = new Vector<>();
        v.addAll(num);
        System.out.println("Vector is : " + v);

//        Un Type Safe
        LinkedList list1 = new LinkedList<>();
        list1.add(1);
        list1.add("One");
        list1.add(2.76);
        System.out.println(list1);
        System.out.println(list1.get(1));
        list1.remove();
        System.out.println(list1);

    }
}
