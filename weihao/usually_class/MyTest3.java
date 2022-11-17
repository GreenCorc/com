package com.weihao.usually_class;

import java.util.Calendar;
import java.util.Scanner;

public class MyTest3 {
    private static Object MonthDay;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入" +
                "年:");
        int year = sc.nextInt();
        System.out.print("请输入月:");
        int month = sc.nextInt();
        int days = 0;//这个月的总天数
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                System.out.println("小测试");
            case 12:
                days = 31;
                break;
            case 4:
                System.out.println("小测试2");
            case 6:
            case 9:
                System.out.println("小测试3");
            case 11:
                days = 30;
                break;
            case 2:
                if((year%4==0 && year%100!=0) || (year%400==0)) { //闰年
                    days = 29;
                } else {
                    days = 28;
                }
                break;
        }
        Calendar c = Calendar.getInstance();
        c.set(year,month-1,1);
        int week =c.get(Calendar.DAY_OF_WEEK);

        System.out.println("日\t一\t二\t三\t四\t五\t六");
        int count = 0;
        //打印空格
        for (int i = 0; i < week-1; i++) {
            System.out.print("\t");
            count++;
        }
        for(int i = 1; i <= days; i++) {
            System.out.print(i + "\t");
            count++;
            //每七天换一行
            if(count % 7 == 0) {
                System.out.println();
            }
        }
    }
}
