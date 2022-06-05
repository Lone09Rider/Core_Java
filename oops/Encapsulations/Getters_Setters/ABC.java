package com.basic.oops.Encapsulations.Getters_Setters;

public class ABC {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        if (id <= 0)
        {
            throw new IllegalArgumentException();
        }
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(this.id);
        System.out.println(this.name);
    }

}
