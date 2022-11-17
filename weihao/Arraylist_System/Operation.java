package com.weihao.Arraylist_System;

import java.util.ArrayList;

public class Operation {
    public static final ArrayList<Person> listp = new ArrayList<>();
    //添加
    public static void add(Person p){
        listp.add(p);
    }
    //删除
    public static void del(Person p){
        listp.remove(p);
    }
    //按名字查找
    public static Person findByName(String name){
        for(int i=0;i<listp.size();i++) {
            if(listp.get(i).getName().equals(name)) {
                return listp.get(i);
            }
        }
        return null;
    }
    //修改
    public static void chg(Person p1 ,Person p2) {
        int x = listp.indexOf(p1);
        listp.set(x, p2);
    }
    //显示所有通讯录
    public static void showAll(){
        for(Person o : listp){
            System.out.println(o.toString());
        }
    }
}
