package cn.itcast.day04.demo05;

import java.util.ArrayList;
import java.util.Random;

/*题目：从1到30中随机抽取5个数，放入ArrayList中，并且遍历集合

 */
public class TimuRandom {
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int num = r.nextInt(30)+1;
            list.add(num);
        }
        for (int i =0; i < list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
