package com.yangdsh.test.lamada.thread;

/**
 * <p> </p>
 *
 * @Author yangdesheng
 * @Date 2019/1/15 16:10
 * @Version 1.0
 */
public class SysronizedTest {

    public static synchronized int runTest() {
        int i = 1;
        System.out.println("i======="+i);
        return i++;
    }

    public static void main(String[] args) {
        new Thread(() -> runTest(),"t1").start();

        System.out.println("------------------------------------");
        new Thread(() -> runTest(),"t2").start();

    }
}
