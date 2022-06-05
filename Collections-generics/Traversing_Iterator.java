package com.generics;

import java.util.ArrayList;
import java.util.Iterator;

public class Traversing_Iterator {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anil");
        names.add("Meenu");
        names.add("Rinka");
        names.add("Meenal");
        names.add("Rakesh");
        System.out.println(names);

        Iterator<String> itr = names.iterator();
        while (itr.hasNext())
        {
            String nxt = itr.next();
            System.out.println(nxt);
        }
    }
}
