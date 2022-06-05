package com.generics;

import java.util.*;

public class For_Each_Loop {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anil");
        names.add("Meenu");
        names.add("Rinka");
        names.add("Meenal");
        names.add("Rakesh");
        System.out.println(names);

        for (String s : names) {
            System.out.print(s + " " + s.length() + " ");
            StringBuffer br = new StringBuffer(s);
            System.out.println(br.reverse());
        }
    }
}
