package com.generics;

import java.util.HashMap;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> courses = new HashMap<>();
        courses.put("Maths", 2000);
        courses.put("Python", 3500);
        courses.put("Core-Java", 4000);
        courses.put("Spring", 8000);
        courses.put("Spring", 8000);

        System.out.println(courses);
        System.out.println(courses.get("Spring"));

        courses.forEach((e1, e2) -> {
            System.out.println(e1 + " -> " + e2);
        });
    }
}
