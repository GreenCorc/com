package com.weihao.Polymorphism;

public class Student extends Person {
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Student{" +
                "number='" + number + '\'' +
                "} " + super.toString();
    }

    public Student() {
    }

    public Student(String name, int age, String address, String number) {
        super(name, age, address);
        this.number = number;
    }

    public void eat(){
        System.out.println("学生吃饭");
    }



    public void study(String number){
        System.out.println(number);
        System.out.println("学生学习student 独有");
    }

}
