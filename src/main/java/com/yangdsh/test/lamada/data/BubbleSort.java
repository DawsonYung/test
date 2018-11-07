package com.yangdsh.test.lamada.data;


/**
 * @ClassName BubbleSort
 * @Author yangdesheng
 * @Date 2018/9/26 10:54
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args) {

        long[] longs = new long[4];
        longs[0] = 20;
        longs[1] = 3;
        longs[2] = 2;
        longs[3] = 40;
         sort(longs);
       for (long i : longs) {
           System.out.print(i+",");

       }
    }

    public static void sort(long arr []) {
        long temp = 0L;
        for (int i = 0;i < arr.length-1;i++){
            for (int k = arr.length-1;k > i;k--) {
                if (arr[k] < arr[k-1]) {
                    temp = arr[k];
                    arr[k] = arr[k-1];
                    arr[k-1] = temp;
                }
            }
        }
    }
}
