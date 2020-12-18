package cn.itcast.day02.SuanFan;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        Integer [] num = {12, 13, 14, 1, 5, 6, 7, 8, 9, 10};
        sort(num);
        System.out.println(Arrays.toString(num));

    }

    /**
     * 插入排序方式
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length ; i++) {
            //拿当前的arr[i]与前排序好的顺序倒序比较，直到找到一个小于等于arr[i]的值，交换位置
            for (int j = i; j >0 ; j--) {
                //循环比较j和j-1的值，
                // 比如j=5，则j-1=4，arr[4]>arr[5],交换位置，此时j=4,j-1=3
                if (greater(arr[j-1], arr[j])) {
                    //交换最小元素
                    exch(arr, j-1, i);
                }else{
                    break;
                }
            }


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
