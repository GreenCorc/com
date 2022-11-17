package com.weihao.test;

import java.util.Scanner;

public class CellSystem {
    public void search(String name0 , String name1){

    }
    public static void main(String[] args) {
        System.out.println("---------------------通讯录管理系统--------------------");
        System.out.println("1.添加 2.删除 3.修改 4.查询所有 5.根据姓名查询 0.退出");
        System.out.println("---------------------通讯录管理系统--------------------");
        Scanner sc = new Scanner(System.in);
        Person[] p = new Person[50];
        int count=0;
        int op =-1;
        while (op!=0) {
            System.out.print("请输入操作：");
            op = sc.nextInt();
            if (op == 1) {//存入
                p[count] = new Person();
                System.out.print("姓名：");
                String name = sc.next();
                p[count].setName(name);
                System.out.print("性别：");
                String gender = sc.next();
                p[count].setGender(gender);
                System.out.print("年龄：");
                int age = sc.nextInt();
                p[count].setAge(age);
                System.out.print("电话：");
                String phonenum = sc.next();
                p[count].setPhonenumber(phonenum);
                System.out.print("QQ：");
                String qq = sc.next();
                p[count].setQq(qq);
                System.out.print("地址：");
                String address = sc.next();
                p[count].setAddress(address);
                count++;
            }
            else if(op==2)//删除
            {
                String name = sc.next();
                for(int i=0;i<p.length;i++){
                    if(p[i].name.equals(name)) {
                        System.out.println("请确认是否删除：（输入y/n）");
                        String  x= sc.next();
                        if(x.equals("y")) {
                            p[i]=null;
                            System.out.println("删除成功！");
                            break;
                        }
                        else if(x.equals("n")){
                            break;
                        }
                    } else{
                        System.out.println("该用户不存在！");
                    }
                }
            }
            else if(op==3)//修改
            {

            }
            else if(op==4)//查询所有
            {
                if(count==0){
                    System.out.println("暂无信息！");
                }
                else{
                    for(int i=0;i<count;i++){
                        System.out.println(p[i].toString());
                    }
                }
            }
            else if(op==5)//根据姓名查询
            {
                String name = sc.next();
                for(int i=0;i<count;i++){
                    if(p[i].name.equals(name)) {
                        System.out.println(p[i].toString());
                    } else{
                        System.out.println("无信息");
                    }
                }
            }
        }
    }
}