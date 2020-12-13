package cn.itcast.day05.demo03;

import java.util.Arrays;
import java.util.Random;

/* 使用Arrays，将一个随机字符串中的字符升序排列，并且倒着打印*/
public class ArraysPractise {
    public static void main(String[] args) {
        String str = "qweeras56671";
        char[] chars = str.toCharArray();
        Arrays.sort(chars);

        for (int i = chars.length-1; i >= 0; i--) {
            System.out.println(chars[i]);

        }
    }
}
