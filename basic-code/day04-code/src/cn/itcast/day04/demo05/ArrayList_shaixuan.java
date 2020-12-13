package cn.itcast.day04.demo05;
/*题目：随机20个数字放入大集合，筛选出偶数放入小集合

 */

import javax.swing.*;
import java.util.ArrayList;
import java.util.Random;

public class ArrayList_shaixuan {
    public static void main(String[] args) {
        Random r = new Random();
        int i = 0;
        ArrayList<Integer> Blist = new ArrayList<>(); // int a [] = {};

        for (i = 0; i < 10; i++) {
            int num = r.nextInt(50) + 1;
            //System.out.println(num);
            Blist.add(num);
            System.out.println(Blist.get(i));
        }
        /*System.out.println("  ");
        ArrayList<Integer> Slist = new ArrayList<>();
        for (int j = 0; j < Blist.size(); j++) {
            int a = Blist.get(j);
            if (a % 2 == 0)
                Slist.add(a);
        }
        for (int j = 0; j < Slist.size(); j++) {
            System.out.println(Slist.get(j));

        } System.out.println("偶数一共有："+Slist.size());   第一种方法*/
        System.out.println("  ");
        ArrayList<Integer> Slist = getSlist(Blist);
        for (int i1 = 0; i1 < Slist.size(); i1++) {
            System.out.println(Slist.get(i1));
        } System.out.println("偶数一共有："+Slist.size());


    }
    public static ArrayList<Integer> getSlist(ArrayList<Integer> Blist){
        ArrayList<Integer> Slist = new ArrayList<>();
        for (int i = 0; i < Blist.size(); i++) {
            int a = Blist.get(i);
            if(a % 2 == 0)
                Slist.add(a);
        }
        return Slist;  //第二种方法



    }
}