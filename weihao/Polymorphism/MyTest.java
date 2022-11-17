package com.weihao.Polymorphism;

public class MyTest {
    public static void main(String[] args) {
        Person p1 = new Person();
        Student s1 = new Student();

        p1.setName("xiaoweihao");
        p1.setAddress("afsafs");
        p1.setAge(10);
        s1.setAddress("100000");
        s1.setAge(100);
        s1.setName("weihao");
        s1.setNumber("123123");
        p1 =new Student();
        ((Student) p1).study(((Student) p1).getNumber());

        //子类继承父类方法 ，直接对象名字加方法名引用

        //只能调用父类的方法，但是显示的是子类的方法使用；父类引用指向子类对象
        Person p2 = new Student();
        // 向上转型 ：把子类对象直接赋给父类引用；
        // 调用的方法是子类的重写的方法，和父类自己的方法；
        // 不能调用子类独有的方法。
        // 父类的引用直接引用自己的方法和子类重写的方法；
        p2.eat();
        p2.run();
        //而且属性值也都是子类的属性值；
        System.out.println(p2.toString());

        Person p3 = s1;
        p3.eat();
        p3.run();
        System.out.println(p3.toString());
        p1.run();
        p1.eat();

        System.out.println("--------------------------------------------");
        //向下转型：把父类对象当做子类对象
        p1 = s1;//

        //((Student) p1).study(((Student) p1).getNumber());
        if(p1 instanceof Student) {
            Student s = (Student)p1;//向下转型是为了将向上转型的父类的东西赋值到子类中，然后能够让子类拥有父类的属性下再调用子类特有的方法；
            s.eat();
            s.run();
            s.study(s.getNumber());
            System.out.println(s.toString());
            System.out.println("----------------------------------------");
            p1.eat();
            p1.run();
            ((Student) p1).study(((Student) p1).getNumber());// 强制转换得到的也是子类里面的东西；
            System.out.println(p1.toString());

        }

/*  多态如何用？
*
*   其实就是用 父类的引用 “接收” 子类的对象
*   让子类的对象的值能够保留
*   再将父类的引用 向下转化（判断一下 instanceof）成子类
*   调用子类独有的方法；

*   即    让我们的方法能够接受更多中类型的类；   注意传过来的类里面的属性值不变 都是子类的属性值；
* public void feed(Animal a) {          //接收子类对象
        if(a instanceof Dog) {          //判断子类对象
            Dog d = (Dog)a;             //向下转型让对象内容体现出来
             d.eat();
        } else if(a instanceof Cat) {
            Cat c = (Cat)a;
            c.eat();
        }
    }
*
* */

        //s1.study();
        //s1.eat();
    }

}
