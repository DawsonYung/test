package com.yangdsh.test.lamada;

import com.yangdsh.entity.AutoExchangeConfig;

/**
 * <p> </p>
 *
 * @Author yangdesheng
 * @Date 2018/10/24 18:37
 * @Version 1.0
 */
public class TestNull {
    public static void main(String[] args) {
        AutoExchangeConfig autoExchangeConfig = new AutoExchangeConfig();
        autoExchangeConfig.setMemo("eiufhdskj");
        autoExchangeConfig.setMemberId(autoExchangeConfig.getCreator());
        System.out.println(autoExchangeConfig.toString());

        int i = 1;
        System.out.println(i++);
        System.out.println(i++);
        System.out.println(++i);
    }
}
