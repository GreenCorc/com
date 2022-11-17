package com.weihao.employeesystem;

import java.util.ArrayList;

public class Operation {
    //private  static final Employee[] emps = new Employee[100];

    private static final ArrayList<Employee> emps = new ArrayList();
    //初始化操作
    //static {
    //    emps = new Employee[100];
    //}

    //添加    ***************重点*********************
    public static void add(Employee emp) {//多态， 接收存入的值
        System.out.println(emp);
        emps.add(emp);
    }
    //删除
    public static void del(String id) {
        for (int i = 0; i < emps.size(); i++) {
            if(emps.get(i).getId().equals(id)) {
                emps.remove(i);
            }
        }
    }

    //修改
    public static boolean chg(String id, Employee emp) {
        for (int i = 0; i < emps.size(); i++) {
            if( emps.get(i).getId().equals(id)) {
                emps.set(i,emp);
                return true;
            }
        }
        return false;
    }

    //查询所有
    public static void findAll() {
        emps.forEach(item-> System.out.println(item));
    }
    //根据工号查询
    public static Employee findById(String id) {
        for (int i = 0; i < emps.size(); i++) {
            if(emps.get(i).getId().equals(id)) {
                return emps.get(i);
            }
        }
        return null;
    }
}