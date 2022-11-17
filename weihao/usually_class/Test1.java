package com.weihao.usually_class;

import java.util.Arrays;
import java.util.Comparator;

public class Test1 {
    public static void main(String[] args) {
        Person p1 = new Person("001", "aiaoweihao", 10);
        Person p2 = new Person("002", "bo", 20);
        Person p3 = new Person("003", "ceihao", 20);
        Person p4 = new Person("004", "diaoweihao", 15);

        System.out.println(p1);
        System.out.println(p2.toString());
        System.out.println(p1 == p2);
        System.out.println(p2 == p3);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        p3 = p1;
        System.out.println(p3 == p1);
        System.out.println(p1.equals(p3));
        System.out.println("------------");
        String str1 = "abc";
        String str2 = "abc";
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println(str1.equals(str2));
        String str = "123";
        String s = "234.33";
        int i = Integer.parseInt(str);
        double v = Double.parseDouble(s);
        System.out.println(str.contains(s));
        System.out.println(str.equalsIgnoreCase(s));
        System.out.println(str.startsWith(s));
        System.out.println(str.endsWith(s));
        //System.out.println(s);
        //System.out.println(i);
        System.out.println(str.substring(1));

        str1="Hello world";
        int a[]= {1,2,3,4,4};

        byte[] arr = str1.getBytes();
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
        System.out.println(str1.length());
        System.out.println(a.length);
        str = str.replace('1','p');
        //str1 = str.replace('123','456');
        System.out.println(str);
        //System.out.println(str1);
        String strarr[] = {"1231","123123","123123"};
        Person[] ps=new Person[]{p1,p2,p3,p4};
        System.out.println("--------------------------");
        Arrays.sort(ps);
        System.out.println(Arrays.toString(ps));
        System.out.println("--------------------------");
        Arrays.sort(strarr, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -(o1.compareTo(o2));
            }
        });
        Arrays.sort(ps, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println(Arrays.toString(ps));
        System.out.println(Arrays.toString(strarr));
    }

}