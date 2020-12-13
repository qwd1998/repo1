package cn.itcast.day07.demo05;

public class shijp implements USB {

    @Override
    public void open() {
        System.out.println("打开键盘搞事情");
    }
    @Override
    public void speak() {
        System.out.println("在抖音里面发狗头，当狗头军");
    }
    @Override
    public void close() {
        System.out.println("关闭键盘，准备休息");
    }
    public void aaa(){
        System.out.println("带货主播直播间全是狗头");
    }
}
