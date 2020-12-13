package day01_code.demo04;

import java.util.ArrayList;
import java.util.Arrays;

public class Demo1 {
    public static void main(String[] args) {
        String s1 = "91 27 46 38 50";
        //把字符串的数字数据存储到一个int类型的数字中国
        String [] array = s1.split(" ");
        int [] arr = new  int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = Integer.parseInt(array[i]);

        }
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length-1){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]+" ");
            }
        }
        String result = sb.toString();
        System.out.println(result);
    }
}
