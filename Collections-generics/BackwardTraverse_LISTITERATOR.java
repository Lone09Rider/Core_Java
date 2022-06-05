package com.generics;

import java.util.ArrayList;
import java.util.ListIterator;

public class BackwardTraverse_LISTITERATOR {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anil");
        names.add("Meenu");
        names.add("Rinka");
        names.add("Meenal");
        names.add("Rakesh");
        System.out.println(names);
//
//        Pass Size for backward traversal
        ListIterator<String> li = names.listIterator(names.size());
        while (li.hasPrevious())
        {
            String pre = li.previous();
            System.out.println(pre);
        }

    }
}
