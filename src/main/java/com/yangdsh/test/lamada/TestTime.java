package com.yangdsh.test.lamada;

import static java.lang.Math.sqrt;

/**
 * @ClassName TestTime
 * @Author yangdesheng
 * @Date 2018/8/28 10:11
 * @Version 1.0
 */
public class TestTime {
    public static void main(String[] args) {

        System.out.println(isPrime(55));
        System.out.println(sqrt(55));
    }

    public static boolean isPrime(int n) { //判断素数
        if (n == 2) return true; //2是素数
        if (n <=1 || n%2 == 0) return false;
        //若n有因数a和b,即n=a*b,那么必有一个因数位于2到√n之间,又因因数对称且成对出现
        // 那么检验范围从2到√n就行了(我们当然可以检验√n到n-1),时间复杂度为O(√n)
        for (int i =3;i <=sqrt(n) ;i++) {
            if(n%2==0) return false;
        }
        return true;
    }
}
