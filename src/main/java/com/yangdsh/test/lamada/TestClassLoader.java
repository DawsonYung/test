package com.yangdsh.test.lamada;

public class TestClassLoader {
    public static void main(String[] args) {
        ClassLoader c = TestClassLoader.class.getClassLoader();
        System.out.println(c);//APPClassLoader
        ClassLoader c1 = c.getParent();
        System.out.println(c1);//ExtClassLoader
        ClassLoader c2 = c1.getParent();

        //Bootstrap Loader,输出为null,因为Bootstrap Loader是用C++语言写的，
        // 依java的观点来看，逻辑上并不存在Bootstrap Loader的类实体，所以在java程序代码里试图打印出其内容时，我们就会看到输出为null
        System.out.println(c2);
    }
}
