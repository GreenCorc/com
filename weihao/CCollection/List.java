package com.weihao.CCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class List {
    public static void main(String[] args) {
        ArrayList<String> list1= new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        list1.add("123");
        list1.add("123");
        list1.add("123");
        list1.add("123");
        list1.add("123");
        list2.add("321");
        list2.add("1321");
        list2.add("112");
        list2.add("1233");
        list2.add("1312");
        list2.add("123131");
        System.out.println(list1);
        //
        //Comparator<? super E> comparator = ;
        //list1.sort(comparator);
        
        
        
        list1.addAll(list2);
        System.out.println(list1);
        list1.addAll(0,list2);
        System.out.println(list1);
        ArrayList<Person> personList = new ArrayList<>();
        personList.add(new Person("0001","xx",20,"ss"));
        personList.add(new Person("0002","xx",20,"ss"));
        personList.add(new Person("0003","xx",20,"ss"));
        personList.add(new Person("0004","xx",20,"ss"));
        Person p1 = new Person("0004","xx",20,"ss");
        System.out.println(personList.contains(p1));
        System.out.println(personList.indexOf(p1));


        System.out.println("迭代器");
        //迭代器
        //Iterator it = list1.iterator();
        //while (it.hasNext()){
        //    Object x = it.next();
        //    System.out.println(x);
        //}
        Iterator<String> it = list1.iterator();//迭代器也要加泛型；
        while (it.hasNext()){
            String x = it.next();
            System.out.println(x);
        }

        ListIterator itls = personList.listIterator(personList.size());
        while (itls.hasPrevious()) {
            Person p2 = (Person) itls.previous();
            System.out.println(p2.toString());
        }
        //Iterator it = personList.iterator();
        //while (it.hasNext()){
        //    Person p2 = (Person)it.next();
        //    //System.out.println(it.next().toString());
        //    System.out.println(p2.toString());
        //}

        //forEach  遍历     lambda输出格式
        personList.forEach(item -> System.out.println(item));
        System.out.println();
        //stream 流遍历；
        personList.stream().forEach(x-> System.out.println(x));

        System.out.println("c++");
        //c++  lambda输出格式
        personList.forEach(System.out::println);

        System.out.println("增强FOR");
        for(Person p:personList) {
            System.out.println(p.toString());
        }




        MyClass1<String> myClass1 = new MyClass1<>();
        myClass1.m1("aaa");

        MyClass2<String> myClass2 = new MyClass2<>();
        myClass2.m1("bbb");

        MyClass3<String> myClass3 = new MyClass3<>();
        myClass3.m1("hello");


    }

}
