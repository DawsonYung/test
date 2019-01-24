package com.yangdsh.test.lamada;

import com.yangdsh.entity.AutoExchangeConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * <p> </p>
 *
 * @Author yangdesheng
 * @Date 2018/12/5 14:49
 * @Version 1.0
 */
public class TestList {
    public static void main(String[] args) {
        AutoExchangeConfig autoExchangeConfig1 = new AutoExchangeConfig();
        autoExchangeConfig1.setMemberId("1");
        autoExchangeConfig1.setExchCurrency("CB");
        autoExchangeConfig1.setId(1L);

        AutoExchangeConfig autoExchangeConfig2 = new AutoExchangeConfig();
        autoExchangeConfig2.setMemberId("2");
        autoExchangeConfig2.setExchCurrency("MMM");
        autoExchangeConfig2.setId(2L);
        List list = new ArrayList();
        list.add(autoExchangeConfig1);
        list.add(autoExchangeConfig2);

        for (int i = 0;i < list.size();i++) {
            AutoExchangeConfig o = (AutoExchangeConfig)list.get(i);
            System.out.println(o.getMemberId());
        }

    }
}
