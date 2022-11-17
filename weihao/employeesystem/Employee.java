package com.weihao.employeesystem;

abstract public class Employee {
    private String id;//员工编号
    private String name; //员工姓名
    private String title; //职务
    private int holiday; //假期
    private double baseSalary; //基本工资

    public Employee() {
    }

    public Employee(String id, String name, String title, int holiday, double baseSalary) {
        this.id = id;
        this.name = name;
        this.title = title;
        this.holiday = holiday;
        this.baseSalary = baseSalary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getHoliday() {
        return holiday;
    }

    public void setHoliday(int holiday) {
        this.holiday = holiday;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //计算实际工资
    abstract public double salary();

    @Override
    public String toString() {
        return "编号：" + id +
                "\t姓名：" + name +
                "\t职务：" + title +
                "\t请假天数：" + holiday +
                "\t工资：" + this.salary();
    }
}
