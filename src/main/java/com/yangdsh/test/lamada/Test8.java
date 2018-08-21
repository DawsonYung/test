package com.yangdsh.test.lamada;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test8 {

    /**
     * 自定义借口lamada测试
     *
     *
     interface MyselfLamada{
     void say(String arg1,String arg2);
     }
     public static void main(String[] args) {
     MyselfLamada my = (String str1,String str2) ->{
     System.out.println("hello,welcome"+str1+str2);
     };
     my.say("to china","fuck");
     }
     *
     */

    /**
     * 测试Collections lamada 写法
     *
     * public  static  void  test(){
     List<String> list = Arrays.asList("aaa","fsa","ser","eere");
     Collections.sort(list, (a,b)->b.compareTo(a)
     );
     for (String string : list) {
     System.out.println(string);
     }
     }

     public static void main(String[] args) {
     test();
     }
     */

    public static void main(String[] args) {
        //test BizeType
        System.out.println(BizType.FUNDIN.name());
    }
}
