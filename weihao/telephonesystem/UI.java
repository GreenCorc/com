package com.weihao.telephonesystem;

import java.util.Scanner;

public class UI {
    public static void help() {
        System.out.println("--------------------------------通讯录管理系统--------------------------------");
        System.out.println("1.添加\t2.删除\t3.修改\t4.查询所有\t5.根据姓名查询\t0.退出");
        System.out.println("--------------------------------通讯录管理系统--------------------------------");
        System.out.print("请选择业务:");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TelephoneBook telephoneBook = new TelephoneBook();
        while(true) {
            help();
            //获取用户输入的选项
            int choose = sc.nextInt();
            if(choose == 1) { //添加
                System.out.println("-----添加通讯录-----");
                System.out.print("姓名:");
                String name = sc.next();
                //判断该用户是否已经存在
                if(telephoneBook.findByName(name) != null) {
                    System.out.println("用户已经存在");
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
                //创建通讯录单条信息的对象
                Person item = new Person(name, gender, age, tel, qq, addr);
                //添加
                boolean result = telephoneBook.add(item);
                if(result == true) {
                    System.out.println(item);
                    System.out.println("添加成功");
                } else {
                    System.out.println("通讯录没有空间，添加失败");
                }
            } else if(choose == 2) { //删除
                System.out.println("-----删除通讯录-----");
                System.out.print("请输入要删除的姓名:");
                String name = sc.next();
                //判断该用户是否存在
                if(telephoneBook.findByName(name) != null) {
                    System.out.print("确定要删除吗？y-确定 n-取消：");
                    String confirm = sc.next();
                    if(confirm.equals("y")) {
                        telephoneBook.del(name);
                        System.out.println("删除成功");
                    } else if(confirm.equals("n")) {
                        System.out.println("取消删除...");
                        continue;
                    } else {
                        System.out.println("请根据提示输入...");
                        continue;
                    }
                } else {
                    System.out.println("该用户不存在...");
                }
            } else if(choose == 3) { //修改
                System.out.println("-----修改通讯录-----");
                System.out.print("请输入要修改的姓名:");
                String oldName = sc.next(); //想要修改的通讯录的姓名
                //根据姓名查询该通讯录是否存在
                //Person oldItem = telephoneBook.findByName(oldName);
                if(telephoneBook.findByName(oldName) == null) {
                    //不存在
                    System.out.println("无信息...");
                    continue;
                } else {
                    System.out.println(telephoneBook.findByName(oldName));
                }
                //修改流程
                System.out.print("新姓名:");
                String name = sc.next(); //修改之后的名字
                if(telephoneBook.findByName(name) != null && !oldName.equals(name)) { //修改之后的名字和其他项名字重复
                    System.out.println("修改之后的名字和其他项名字重复，不允许修改");
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
                //修改之后的对象
                Person item = new Person(name, gender, age, tel, qq, addr);
                //修改
                telephoneBook.chg(oldName,item);
                System.out.println("修改成功");
            } else if(choose == 4) { //查询所有
                Person[] items = telephoneBook.findAll();
                System.out.println("-----打印所有通讯录-----");
                for (int i = 0; i < items.length; i++) {
                    if(items[i] != null) {
                        System.out.println(items[i]);
                    }
                }
            } else if(choose == 5) { //根据姓名查询
                System.out.println("-----根据姓名查询-----");
                System.out.print("姓名:");
                String name = sc.next();
                Person item = telephoneBook.findByName(name);
                if(item != null) {
                    System.out.println(item);
                } else {
                    System.out.println("该条信息不存在...");
                }
            } else if(choose == 0) { //退出
                return;
            } else {
                System.out.println("请根据提示输入.....");
            }
        }
    }

}
