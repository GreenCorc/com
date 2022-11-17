package com.weihao.Arraylist_System;

import java.util.Scanner;

public class Ui {
    public static void help() {
        System.out.println("--------------------------------通讯录管理系统--------------------------------");
        System.out.println("1.添加\t2.删除\t3.修改\t4.查询所有\t5.根据姓名查询\t0.退出");
        System.out.println("--------------------------------通讯录管理系统--------------------------------");
        System.out.print("请选择业务:");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Operation op = new Operation();

        while(true){
            help();
            int op = sc.nextInt();
            if(op==1){
                System.out.println("-----添加通讯录-----");
                System.out.print("姓名:");
                String name = sc.next();
                if(Operation.findByName(name)!=null){
                    System.out.println("改联系人已存在，请重新选择！");
                    continue;
                }
                System.out.print("性别:");
                String gender = sc.next();
                System.out.print("年龄:");
                int age = sc.nextInt();
                System.out.print("电话:");
                String tel = sc.next();
                System.out.print("QQ:");
                String qq = sc.next();
                System.out.print("地址:");
                String addr = sc.next();
                Person p =new Person(name,gender,age, tel, qq,addr);
                System.out.println("添加成功！");
                Operation.add(p);
            } else if(op==2){
                System.out.println("请输入要删除的联系人的姓名：");
                String name = sc.next();
                if(Operation.findByName(name)==null){
                    System.out.println("没有此联系人！");
                } else{
                    System.out.println("确定删除该联系人？（y/n）");
                    String r = sc.next();
                    if(r.equals("y")){
                        Operation.del(Operation.findByName(name));
                        System.out.println("删除成功！");
                        //continue ;
                    }else if(r.equals("n")){
                        System.out.println("删除失败！");
                    }
                    else {
                        System.out.println("未输入正确！");
                    }
                }
            } else if(op==3){
                System.out.println("请输入将要修改联系人的名字：");
                String oldName = sc.next();
                if(Operation.findByName(oldName)==null){
                    System.out.println("无信息！");
                    continue;
                }
                else{
                    Person oldp =Operation.findByName(oldName);
                    System.out.println("请输入新的信息：");
                    System.out.print("姓名:");
                    String name = sc.next();
                    System.out.print("性别:");
                    String gender = sc.next();
                    System.out.print("年龄:");
                    int age = sc.nextInt();
                    System.out.print("电话:");
                    String tel = sc.next();
                    System.out.print("QQ:");
                    String qq = sc.next();
                    System.out.print("地址:");
                    String addr = sc.next();
                    Person np = new Person(name,gender,age, tel, qq,addr);
                    Operation.chg(oldp,np);
                    System.out.println("修改成功!");
                }
            }else if(op==4){
                Operation.showAll();
            }else if(op==0){
                break;
            }else if(op==5){
                System.out.println("请输入联系人姓名：");
                String name = sc.next();
                if(Operation.findByName(name)!=null){
                    System.out.println(Operation.findByName(name).toString());
                }
            }
            else {
                System.out.println("请输入正确的操作数！！");
            }

        }
    }
}
