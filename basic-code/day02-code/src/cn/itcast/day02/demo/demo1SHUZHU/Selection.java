package cn.itcast.day02.demo.demo1SHUZHU;


import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        Integer [] num = {12, 13, 14, 1, 5, 6, 7, 8, 9, 10};
        sort(num);
        System.out.println(Arrays.toString(num));
    }

    /**
     * 选择排序方式
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            //定义一个索引，记录最小值的索引位置
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (greater(arr[minIndex], arr[j])) {
                    minIndex = j;
                }
            }
            //交换最小元素所在索引的值
            exch(arr, i, minIndex);
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
