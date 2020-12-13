package day01_code.DOUdizhu;

import java.util.*;

public class Demo02Map {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        String[] colors = {"♥", "♠", "♦", "♣"};
        String[] number = {"2", "A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3"};
        int indenx = 0;
        map.put(indenx, "小王");
        list.add(indenx);
        indenx++;
        map.put(indenx, "大王");
        list.add(indenx);
        indenx++;

        for (String s : number) {
            for (String color : colors) {
                indenx++;
                /*System.out.print(indenx);
                System.out.println(color+"  "+s);*/
                map.put(indenx, color + s);
                list.add(indenx);
            }
        }
        //System.out.println(map);
        Collections.shuffle(list);  //洗牌

        ArrayList<Integer> p1 = new ArrayList<>();
        ArrayList<Integer> p2 = new ArrayList<>();
        ArrayList<Integer> p3 = new ArrayList<>();
        ArrayList<Integer> p4 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Integer integer = list.get(i);
            if (i >= list.size() - 3) {
               // String s = map.get(integer);
                p1.add(integer);
            } else if (i % 3 == 1) {
               // String s = map.get(integer);
                p2.add(integer);
            } else if (i % 3 == 2) {
                //String s = map.get(integer);
                p3.add(integer);

            } else if (i % 3 == 0) {
               // String s = map.get(integer);
                p4.add(integer);
            }
        }
        Collections.sort(p1);
        Collections.sort(p2);
        Collections.sort(p3);
        Collections.sort(p4);
        look("德玛1",map,p1);
        look("德玛2",map,p2);
        look("德玛3",map,p3);
        look("德玛4",map,p4);

    }

        private static void look(String name,HashMap<Integer, String> map,ArrayList<Integer> list){
            System.out.print("我叫："+name+"  ");
            for (Integer integer : list) {
                String s = map.get(integer);
                System.out.print(s+" ");
            }System.out.println();

        }

}

