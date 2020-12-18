package cn.itcast.day02.SuanFan;

import java.util.Arrays;

public class Shell {
    public static void main(String[] args) {
        long l = System.currentTimeMillis();
        Integer [] num = {12, 13, 14, 1, 5, 6, 7, 8, 9, 10};
        sort(num);
        System.out.println(Arrays.toString(num));
    }

    /**
     * 希尔排序的方式，是插入排序的升级版
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        //获取数组长度
        int N = arr.length;
        int h = 1;
        while (h < N / 2) {
            h = 2 * h + 1;
        }
        while (h >=1) {
            for (int i = h; i < N; i++) {
                //排序
                //1.找到待插入的元素
                for (int j = i; j >= h; j -= h) {
                    if (greater(arr[j-h],arr[j])){
                        exch(arr,j-h,j);
                    }else{
                        break;
                    }
                }
            }
            //减小h的值
            h /= 2;
        }

    }

    /**
     * 判断v是否大于w
     *
     * @param v
     * @param w
     * @return
     */
    private static Boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    /**
     * 交换i索引和j索引的值
     *
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
