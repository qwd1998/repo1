package day02_code.demo03Map;

import java.util.HashMap;
import java.util.Scanner;

/*
练习： 计算一个字符中每一个字符出现次数

分析：1.使用Scanner获取用户输入的字符串
     2.创建Map集合，K是字符串的字符，V是字符个数
     3.遍历字符串，获取每一个字符
     4.使用获取的字符，用Map判断k是否存在
            K存在，V++；  put(k,v);
            K不存在，put(k,1);

 */
public class Demo03P {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String s = sc.next();
        char[] chars = s.toCharArray();
        //创建一个Map集合，key是字符串的字符，value是字符的个数
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
           if (map.containsKey(c)){
                Integer value = map.get(c);
                value++;
                map.put(c,value);
            }else{
                map.put(c,1);
            }
        }
        for (Character character : map.keySet()) {
            Integer integer = map.get(character);
            System.out.println(character+"  "+ integer);
        }
    }
}
