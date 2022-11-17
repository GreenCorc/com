package com.weihao.employeesystem;

public class Manager extends Employee {
    public Manager() {
    }

    public Manager(String id, String name, String title, int holiday, double base_salary) {
        super(id, name, title, holiday, base_salary);
    }

    @Override
    public double salary() {
        //实际工资 = 总工资 - 扣除工资
        double sum = this.getBaseSalary() + this.getBaseSalary() * 0.2 + this.getBaseSalary() * 0.5 + 500;
        return sum - (sum / 21.75) * this.getHoliday();
    }
}