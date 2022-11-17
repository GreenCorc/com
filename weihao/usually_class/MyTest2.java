package com.weihao.usually_class;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MyTest2 {
    public static void main(String[] args) {
        System.out.println(Math.PI);
        System.out.println(Math.E);
        System.out.println(Math.random());
        System.out.println((int)(Math.random()*10));
        Math.random();
        int n =10;
        //while(n-- >0){
        //    System.out.println((int)(Math.random()*100));
        //}
        while(n-- >0){
            System.out.println(((int)(Math.random()*10))%4+1);
        }


        Date d1= new Date();
        System.out.println(d1);
        long x = d1.getTime();
        Date d2 = new Date(999999777755L);
        System.out.println(d2);
        System.out.println(x);
        SimpleDateFormat s1= new SimpleDateFormat("YY/LL/dd F a hh:mm:ss E w W");
        System.out.println(s1.format(d1));

    }
}
