package com.weihao.employeesystem;

import java.util.Scanner;

public class UI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            
            menu();
            //获取用户选择
            int choose = sc.nextInt();
            if(choose == 1) {
                System.out.print("请输入员工编号：");
                String id = sc.next();
                if(Operation.findById(id) != null) {
                    System.out.println("该编号的员工已经存在，请重新输入");
                    continue;
                }
                System.out.print("请输入员工姓名：");
                String name = sc.next();
                System.out.print("请输入员工职务（普通员工、经理、董事长）：");
                String title = sc.next();
                Employee emp = null;
                switch (title) {
                    case "普通员工":
                        emp = new CommonEmployee();
                        //emp.salary();
                        break;
                    case "经理":
                        emp = new Manager();
                        break;
                    case "董事长":
                        emp = new Director();
                        break;
                    default:
                        System.out.println("输入错误，请输入普通员工、经理、董事长中的任何一个值...");
                        continue;
                }
                System.out.print("请输入员工请假天数：");
                int holiday = sc.nextInt();
                System.out.print("请输入员工基本工资：");
                double baseSalary = sc.nextDouble();
                emp.setId(id);
                emp.setName(name);
                emp.setTitle(title);
                emp.setHoliday(holiday);
                emp.setBaseSalary(baseSalary);

                //添加
                Operation.add(emp);
                System.out.println("增加数据成功");
                System.out.println(emp);
            } else if(choose == 2) {
                System.out.println("请输入将要删除的员工编号：");
                String id = sc.next();
                if(Operation.findById(id) == null) {
                    System.out.println("该编号的员工不存在，请重新输入...");
                    continue;
                }
                Operation.del(id);
                System.out.println("删除数据成功");
            } else if(choose == 3) {
                System.out.println("请输入将要修改的员工编号：");
                String idOld = sc.next();
                //查询修改之前的信息
                Employee oldEmp = Operation.findById(idOld);
                if(oldEmp == null) {
                    System.out.println("该编号的员工不存在，不允许修改...");
                    continue;
                }
                System.out.println(oldEmp);
                System.out.println("请重新输入员工的信息");
                System.out.print("请输入员工编号：");
                String idNew = sc.next();
                //要确保员工的编号和其他员工没有重复
                if(Operation.findById(idNew) != null && !idNew.equals(idOld)) {
                    System.out.println("新的员工编号和其他员工的编号重复，不允许修改...");
                    continue;
                }
                System.out.print("请输入员工姓名：");
                String name = sc.next();
                System.out.print("请输入员工职务（普通员工、经理、董事长）：");
                String title = sc.next();
                Employee emp = null;
                switch (title) {
                    case "普通员工":
                        emp = new CommonEmployee();
                        break;
                    case "经理":
                        emp = new Manager();
                        break;
                    case "董事长":
                        emp = new Director();
                        break;
                    default:
                        System.out.println("输入错误，请输入普通员工、经理、董事长中的任何一个值...");
                        continue;
                }
                System.out.print("请输入员工请假天数：");
                int holiday = sc.nextInt();
                System.out.print("请输入员工基本工资：");
                double baseSalary = sc.nextDouble();
                emp.setId(idNew);
                emp.setName(name);
                emp.setTitle(title);
                emp.setHoliday(holiday);
                emp.setBaseSalary(baseSalary);

                //修改
                Operation.chg(idOld, emp);
                System.out.println("修改数据成功");
                System.out.println(emp);
            } else if(choose == 4) {
                Operation.findAll();
            } else if(choose == 5) { //根据编号查询
                System.out.println("请输入员工编号：");
                String id = sc.next();
                Employee emp = Operation.findById(id);
                if(emp == null) {
                    System.out.println("该编号员工不存在...");
                } else {
                    System.out.println(emp);
                }
            } else if(choose == 0) {
                System.exit(0);
            } else {
                System.out.println("请根据提示信息选择...");
                continue;
            }
        }
    }

    public static void menu() {
        System.out.println("|------------------|");
        System.out.println("|-----1、增加------|");
        System.out.println("|-----2、删除------|");
        System.out.println("|-----3、修改------|");
        System.out.println("|-----4、查询所有---|");
        System.out.println("|-----5、查询------|");
        System.out.println("|-----0、退出------|");
        System.out.println("|------------------|");
        System.out.print("请选择业务：");
    }
}
