package cn.itcast.day05.demo03;

import java.util.Arrays;

/* public static String toString(数组)*/
public class Demo03Arrays {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5};
        String str = Arrays.toString(arrays);
        System.out.println(str);

        int[] array1= {8,6,4,7,9};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));

    }
}
