package com.generics;

import java.util.ArrayList;

public class For_Each_Method {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Anil");
        names.add("Meenu");
        names.add("Rinka");
        names.add("Meenal");
        names.add("Rakesh");
        System.out.println(names);

        names.forEach(e->{
            System.out.println(e);
        });

    }
}
