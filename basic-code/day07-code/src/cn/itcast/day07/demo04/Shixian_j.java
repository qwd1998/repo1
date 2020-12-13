package cn.itcast.day07.demo04;

public class Shixian_j implements Usb{
    @Override
    public void open() {
        System.out.println("打开键盘");
    }

    @Override
    public void close() {
        System.out.println("关闭键盘");
    }
    public void shuru(){
        System.out.println("键盘输入");
    }
}
