package com.weihao.usually_class;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyTest {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        String s1 = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println(s1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy年MM月dd日 HH:mm:ss");
        String s3 = now.format(formatter);
        System.out.println(s3); //2022年01月07日 05:38:17

        //将特定格式的字符串转化为日期时间对象
        LocalDateTime localDateTime1 = LocalDateTime.parse("2021-05-10T11:43:14.875");
        System.out.println(localDateTime1); //2021-05-10T11:43:14.875
        LocalDateTime localDateTime2 = LocalDateTime.parse("2022年01月08日 11:44:03", formatter);
        System.out.println(localDateTime2); //2022-01-08T11:44:03
    }
}
