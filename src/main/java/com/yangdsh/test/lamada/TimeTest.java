package com.yangdsh.test.lamada;

/**
 * @ClassName TimeTest
 * @Author yangdesheng
 * @Date 2018/9/3 18:51
 * @Version 1.0
 */
public class TimeTest {
    public static void main(String[] args) {
        int a = 1;
        String s = "kghkasgfala  ,  ";
//        System.out.println("aaaaaaaaaaa"+System.getenv());
//        Long l = 100L;
//        Long l2 = 100L;
//        if (l.equals(l2)) {
//            System.out.println("==========");
//        }else {
//            System.out.println("fuck your sister");
//        }


        if(s.contains(",")) {
           s.replace(",","").trim();
            System.out.println(s);
        }

    }
}
