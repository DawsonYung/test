package com.yangdsh.test.lamada.test.reflect;

/**
 * 反射ReflectGetClassTest
 *
 * 获取Class对象的三种方式
 *
 * 1.1 Object ——> getClass();
 * 1.2 任何数据类型（包括基本数据类型）都有一个“静态”的class属性
 *1.3 通过Class类的静态方法：forName（String  className）(常用)
 *
 *
 * 注意：在运行期间，一个类，只有一个Class对象产生
 *
 * 三种方式常用第三种，第一种对象都有了还要反射干什么。
 * 第二种需要导入类的包，依赖太强，不导包就抛编译错误。
 * 一般都第三种，一个字符串可以传入也可写在配置文件中等多种方法
 */

public class ReflectGetClassTest {
    public static void main(String[] args) {
        //方式1
        Student stu = new Student();
        Class stuClass = stu.getClass();
        System.out.println(stuClass);

        //方式2
        Class stuClass2 = Student.class;
        System.out.println(stuClass2==stuClass);

        try {
            //方式3
            Class stuClass3 = Class.forName("com.yangdsh.test.lamada.test.reflect.Student");
            System.out.println(stuClass3==stuClass2);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
