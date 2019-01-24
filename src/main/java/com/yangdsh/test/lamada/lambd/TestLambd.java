package com.yangdsh.test.lamada.lambd;

/**
 * <p> </p>
 *
 * @Author yangdesheng
 * @Date 2018/12/10 12:03
 * @Version 1.0
 */
public class TestLambd {
    public static void main(String[] args) {
        TestInterface<Person> testInterface = (p1,p2)-> Integer.compare(p1.getScore(), p2.getScore());
    }
}
