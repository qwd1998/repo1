package cn.itcast.day02.SuanFan;

import java.util.Arrays;

public class Merge {

    public static void main(String[] args) {
        Integer[] num = {12, 13, 14, 1, 5, 6, 7, 8, 9, 10, 10};
        sort(num);
        System.out.println(Arrays.toString(num));
    }

    private static Comparable[] assist;

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

    /**
     * 对数组中的元素进行排序
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        //1.初始化辅助数组assist
        assist = new Comparable[arr.length];
        //2.定义一个lo和hi变量，分别记录数组中的最小索引和最大索引
        int lo = 0;
        int hi = assist.length - 1;
        //3.调用sort重载方法数组arr中，从索引lo到hi的元素排序
        sort(arr, lo, hi);
    }

    /**
     * 对数组中lo到hi的元素进行排序
     *
     * @param arr
     * @param lo
     * @param hi
     */
    private static void sort(Comparable[] arr, int lo, int hi) {
        //1.安全性校验
        if (hi <= lo) {
            return;
        }
        //2.对数组进行分组，分成两个小组
        int mi = lo + (hi - lo) / 2;

        //3.分别对每一组数据进行排序
        sort(arr, lo, mi);
        sort(arr, mi + 1, hi);

        //4.对这两组的数据进行归并
        merge(arr, lo, mi, hi);
    }

    /**
     * 对数组中，从lo到mi为一组，mi+1到hi为一组，对这两组数据进行归并
     *
     * @param arr
     * @param lo
     * @param mi
     * @param hi
     */
    private static void merge(Comparable[] arr, int lo, int mi, int hi) {
        //1.定义3个指针
        int i = lo;
        int p1 = lo;
        int p2 = mi + 1;
        //2.遍历，移动p1指针和p2指针，找出两个指针对应的索引出的值的大小，把小的放入辅助数组中
        while (p1 <= mi && p2 <= hi) {
            //比较对应索引出的元素的大小
            if (greater(arr[p1], arr[p2])) {
                assist[i++] = arr[p2++];
            } else {
                assist[i++] = arr[p1++];
            }
        }
        //3.遍历，如果p1指针没有走完，那么顺序移动p1指针，把对应元素的值放入辅助数组中
        while (p1 <= mi) {
            assist[i++] = arr[p1++];
        }
        //4.遍历，如果p2指针没有走完，那么顺序移动p2指针，把对应元素的值放入辅助数组中
        while (p2 <= hi) {
            assist[i++] = arr[p2++];
        }
        //5.把辅助数组的值赋予原数组
        for (int i1 = lo; i1 <= hi; i1++) {
            arr[i1] = assist[i1];
        }
    }

}
