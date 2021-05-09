package com.company;

public class Student {
    private String name;
    private String id;

    public Student() {
        name = "";
        id = "";
    }

    public void setName(String nm) {
        name = nm;
    }

    public void setId(String d) {
        id = d;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String toString() {

        return "Name = " + name + ", ID = " + id;
    }

}
