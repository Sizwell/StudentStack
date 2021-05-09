package com.company;

public class MyStack {

    private Student[] data;
    private int top;

    public MyStack(){
        data = new Student[5];
        top = -1;
    }

    public void push(Student value){
        top = top + 1;
        data[top] = value;
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        }else {
            return false;
        }
    }

    public Student peek() {
        return data[top];
    }

    public Student pop() {
        Student value = data[top];
        top = top -1;
        return value;
    }



}
