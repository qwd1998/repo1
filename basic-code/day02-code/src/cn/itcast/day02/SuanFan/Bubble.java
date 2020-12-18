package cn.itcast.day02.SuanFan;

import java.util.Arrays;

public class Bubble {

    public static void main(String[] args) {
        Integer [] num = {12, 13, 14, 1, 5, 6, 7, 8, 9, 10};
        sort(num);
        System.out.println(Arrays.toString(num));
    }

    /**
     * 冒泡排序的方式
     * 时间复杂度为O(n^2)
     *
     * @param arr
     */
    public static void sort(Comparable [] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (greater(arr[i],arr[j])){
                    exch(arr,i,j);
                }
            }
        }

    }

    /**
     * 判断v是否大于w
     * @param v
     * @param w
     * @return
     */
    private static Boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     * 交换i索引和j索引的值
     * @param arr
     * @param i
     * @param j
     */
    private static void exch(Comparable[] arr, int i, int j) {
        Comparable temp;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
