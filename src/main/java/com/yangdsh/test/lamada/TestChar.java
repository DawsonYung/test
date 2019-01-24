package com.yangdsh.test.lamada;

/**
 * <p> </p>
 *
 * @Author yangdesheng
 * @Date 2019/1/24 13:51
 * @Version 1.0
 */
public class TestChar {
    static final int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    public static void main(String[] args) {
        System.out.println("names".hashCode());
        System.out.println(hash("names"));
    }
}
