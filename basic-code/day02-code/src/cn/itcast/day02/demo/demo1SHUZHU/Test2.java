package cn.itcast.day02.demo.demo1SHUZHU;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Test2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("请输入共有多少人：");
        int n = s.nextInt();
        s.close();
        System.out.println("最后留下来的是原来的"+game(n)+"号");

    }
    public static int game(int n) {
                 int counter=3;
                  List<Integer> list = new ArrayList<>();
                     for (int i = 1; i <=n ; i++) list.add(i);
                     int index = -1;
                     while (list.size() > 1) {
                             index = (index + counter) % list.size();
                             list.remove(index--);
                         }
                     return list.get(0);
                 }

}
