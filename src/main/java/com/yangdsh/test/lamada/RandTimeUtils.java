package com.yangdsh.test.lamada;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p> </p>
 *
 * @Author yangdesheng
 * @Date 2018/10/26 17:17
 * @Version 1.0
 */
public class RandTimeUtils {
    public static void main(String[] args) {
        String str =  new SimpleDateFormat("hhmmss").format(new Date());
        int i = (int)(Math.random()*900 + 100);
        String myStr = Integer.toString(i);
        System.out.println(myStr);
        System.out.println(str+myStr);

        String displayUserName = "uyuietyiyeyri3423_85732958943";
        String s = displayUserName.substring(0,displayUserName.indexOf("_"));
        System.out.println(s);
    }

}
