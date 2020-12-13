package cn.itcast.day05.demo03;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

/*题目： 定义一个方法：把数组{1,2,3}按照指定格式拼接成一个字符串：{word1#word2#word3}


 * */
public class Demo01Practise {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        frome(array);
    }
    public static void frome(int [] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print("word"+array[i]+"#");
            if(i == array.length-1){
                System.out.print("word"+array[i]+"}");
            }
        }
    }
    /*public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random r = new Random();
        // System.out.print("[");
        for (int i = 0; i < 5; i++) {
            int n = r.nextInt(10) + 1;
            list.add(n);
            System.out.print(list.get(i) + "%");
            if (i == 4) {
                System.out.println(list.get(i) + "]");

            }
        }}*/
}