package com.company;

public class Main {

    public static void main(String[] args) {

        MyStack aStack = new MyStack();

        Student aStudent = new Student();
        aStudent.setName("John");
        aStudent.setId("01234");

        Student bStudent = new Student();
        bStudent.setName("Sizwe");
        bStudent.setId("0563");

        Student cStudent = new Student();
        cStudent.setName("Vuyo");
        cStudent.setId("2342");

        Student dStudent = new Student();
        dStudent.setName("Sipho");
        dStudent.setId("1453");

        Student eStudent = new Student();
        eStudent.setName("Sive");
        eStudent.setId("6342");

        aStack.push(aStudent);
        aStack.push(bStudent);
        aStack.push(cStudent);
        aStack.push(dStudent);
        aStack.push(eStudent);

//        astack.push("Sizwe");
//        astack.push("Nonjiko");
//        astack.push("Junior");
//        astack.push("Nodiki");
//        astack.push("Lonwabo");

        System.out.println(aStack.pop());
        System.out.println(aStack.pop());
        System.out.println(aStack.pop());
        System.out.println(aStack.pop());
        System.out.println(aStack.pop());
    }
}
