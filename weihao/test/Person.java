package com.weihao.test;

public class Person {
    public String name;
    public String gender;
    public int age;
    public String phonenumber;
    public String qq;
    public String address;

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;

    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getPhonenumber() {
        return phonenumber;
    }

    public String getQq() {
        return qq;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", phonenumber='" + phonenumber + '\'' +
                ", qq='" + qq + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
