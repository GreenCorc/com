package com.weihao.Arraylist_System;

public class Person {
    private String name;
    private String gender;
    private int age;
    private String telephone;
    private String qq;
    private String address;

    public Person(String name, String gender, int age, String telephone, String qq, String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.telephone = telephone;
        this.qq = qq;
        this.address = address;
    }
    public Person() {

    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public String getTelephone() {
        return telephone;
    }

    public String getQq() {
        return qq;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "TelephoneItem{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", telephone='" + telephone + '\'' +
                ", qq='" + qq + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
