package com.yangdsh.test.lamada;
//import org.junit.Test;

public class Testc {

    //@Test
    public void testLamada(){
//        func((Integer x) -> true);
        func((Integer x) -> {
            System.out.println("Hello World" + x);
            return true;
        });
    }

    private void func(ITest<Integer> itest) {
        int x = 1;
        itest.test(x);
        }
}
