package cn.itcast.day02.SuanFan;

import java.util.Arrays;

public class Quick {

    public static void main(String[] args) {
        Integer [] num = {12, 13, 14, 1, 5, 6, 7, 8, 9, 10};
        sort(num);
        System.out.println(Arrays.toString(num));
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

    /**
     * 对数组中的元素进行排序
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {

        int lo = 0;
        int hi = arr.length - 1;
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
        //2.对数组进行分组，分成两个小组，左子组合右子组
        int partition = partition(arr, lo, hi); //返回的是分组的分界值所在的索引，分界值位置变化后的索引

        //3.让左子祖有序
        sort(arr, lo, partition - 1);

        //4.让右子组有序
        sort(arr, partition + 1, hi);
    }

    /**
     * 对数组arr中，从索引lo到hi之间的元素进行分组，并且返回分组界限对应的索引
     *
     * @param arr
     * @param lo
     * @param hi
     * @return
     */
    private static int partition(Comparable[] arr, int lo, int hi) {
        //1.确定分界值
        Comparable key = arr[lo];

        //2.定义两个指针，一个左指针，一个右指针，左指针向右移动，右指针向左移动
        int p1 = lo;
        int p2 = hi+1;

        //3.切分
        while (true) {

            while(greater(key,arr[++p1])){
                if (p1==hi){
                    break;
                }
            }
            while(greater(arr[--p2],key)){
                if (p2==lo){
                    break;
                }
            }
            if (p1>=p2){
                break;
            }else {
                exch(arr,p1,p2);
            }
        }
        exch(arr,lo,p2);

        return p2;
    }
}
