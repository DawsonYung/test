package com.yangdsh.test.lamada.test.reflect;


import java.lang.reflect.Field;

/**
 * 反射 ReflectGetFieldTest
 *
 * 获取成员变量并调用：
 *
 * 1.批量的
 * 		1).Field[] getFields():获取所有的"公有字段"
 * 		2).Field[] getDeclaredFields():获取所有字段，包括：私有、受保护、默认、公有；
 * 2.获取单个的：
 * 		1).public Field getField(String fieldName):获取某个"公有的"字段；
 * 		2).public Field getDeclaredField(String fieldName):获取某个字段(可以是私有的)
 *
 * 	 设置字段的值：
 * 		Field --> public void set(Object obj,Object value):
 * 					参数说明：
 * 					1.obj:要设置的字段所在的对象；
 * 					2.value:要为字段设置的值；
 *
 *
 *
 * 	################获取成员方法并调用暂不演示，同上#####################
 * 	获取成员方法并调用：
 *
 * 1.批量的：
 * 		public Method[] getMethods():获取所有"公有方法"；（包含了父类的方法也包含Object类）
 * 		public Method[] getDeclaredMethods():获取所有的成员方法，包括私有的(不包括继承的)
 * 2.获取单个的：
 * 		public Method getMethod(String name,Class<?>... parameterTypes):
 * 					参数：
 * 						name : 方法名；
 * 						Class ... : 形参的Class类型对象
 * 		public Method getDeclaredMethod(String name,Class<?>... parameterTypes)
 *
 * 	 调用方法：
 * 		Method --> public Object invoke(Object obj,Object... args):
 * 					参数说明：
 * 					obj : 要调用方法的对象；
 * 					args:调用方式时所传递的实参
 */
public class ReflectGetFieldTest {
    public static void main(String[] args) throws Exception {
        //1.获取class对象
        Class clzz = Class.forName("com.yangdsh.test.lamada.test.reflect.Student");
        //2.获取字段
        System.out.println("**********************所有公有字段**********************");
        Field[] fieldArray = clzz.getFields();
        for (Field field : fieldArray){
            System.out.println(field);
        }
        System.out.println("***************所有字段(public,protected,private)***************");
        fieldArray = clzz.getDeclaredFields();
        for (Field field : fieldArray){
            System.out.println(field);
        }
        System.out.println("**************获取某个公有字段并调用***************");
        Field field = clzz.getField("Num");
        System.out.println(field);
        //获取一个对象
        //产生Student对象--》Student stu = new Student()
        Object obj = clzz.getConstructor().newInstance();
        //为字段设置值
        //为Student对象中的num属性赋值--》stu.num = "12345678900"
        field.set(obj,"12345678900");

        //验证
        Student stu = (Student)obj;
        System.out.println("验证学号：" + stu.Num);

        System.out.println("**************获取某个私有字段并调用***************");
        field = clzz.getDeclaredField("name");
        System.out.println(field);
        field.setAccessible(true);//暴力反射，解除私有限定
        field.set(obj,"张三");
        System.out.println("验证姓名：" + stu.getName());

    }
}
