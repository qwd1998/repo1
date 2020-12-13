package cn.itcast.day06.demo03;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member(){

    }
    public Member(String name,int money){
        super(name,money);
    }
    public void receive(ArrayList<Integer> list){
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());

        //根据索引，从集合中删除
        int i = list.remove(index);

        //当前成员本来有多少钱
        int money = super.getMoney();
        super.setMoney(money + i);
    }
}
