package com.weihao.employeesystem;

public class CommonEmployee extends Employee {
    public CommonEmployee() {
    }

    public CommonEmployee(String id, String name, String title, int holiday, double base_salary) {
        super(id, name, title, holiday, base_salary);
    }

    @Override
    public double salary() {
        //实际工资 = 总工资 - 扣除工资
        double sum = this.getBaseSalary() + this.getBaseSalary() * 0.1 + this.getBaseSalary() * 0.5 + 200;
        return sum - (sum / 21.75) * this.getHoliday();
    }
}