package cn.itcast.day04.demo04;

import java.util.ArrayList;

/*list.add(); 添加一个元素
list.get（int index）  获取某一个元素
list.remove（int index） 删除一个元素
list.size();
 */
public class Demo01ArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list);
        list.add("ww");
        list.add("aa");
        list.add("ss");
        System.out.println("输出的为："+list);

        String s = list.get(2);
        System.out.println("获取的元素："+s);

        String remove = list.remove(1);
        System.out.println("删除的元素是："+remove);
        System.out.println("元素为："+list);

        int size = list.size();
        System.out.println("数组长度"+size);

    }

}
