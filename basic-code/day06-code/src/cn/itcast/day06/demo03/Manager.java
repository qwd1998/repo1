package cn.itcast.day06.demo03;

import java.util.ArrayList;

public class Manager extends User{
    public Manager(){

    }
    public Manager(String name,int money){
        super(name,money);
    }
    public ArrayList<Integer> send(int summoney,int count){
        //首先需要一个集合，用了存储若干金额
        ArrayList<Integer> redlist = new ArrayList<Integer>();
        //首先看看群主有多少钱
        int leftMoney = super.getMoney();
        if(summoney >super.getMoney()){
            System.out.println("余额不足");
            return redlist;
        }
        //扣钱，显示群主的余钱
        super.setMoney(leftMoney - summoney);

        //发红包，平均拆分
        int avg = summoney/count;
        int mod = summoney%count;  //余数
        //除不开的零头放入最后一个包里
        for (int i = 0; i < count-1; i++) {
            redlist.add(avg);
        }
        int last = avg + mod;
        redlist.add(last);
        return  redlist;
    }
}
