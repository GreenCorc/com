package com.weihao.Arraylist_System;

public class MyTest {
    public static void main(String[] args) {
        Person p1 = new Person("123","123",20,"123","123","123");
        Operation.add(p1);
        System.out.println(Operation.findByName("123"));


    }
}
