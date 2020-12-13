package cn.itcast.day03.demo01;

import java.util.Arrays;

public class Demo01 {
    public static void main(String[] args) {
        int[] array = {10,20,30,40,50};
        //要求打印效果为{10,20,30,40,50}
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.println(array[i] + "]");
            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.println("========");
        System.out.println(Arrays.toString(array));//使用面向对象
        //找一个jdk给我们提供一个Arrays类，其中toString可以把数组写成为{10,20,30,40,50}

    }
}
