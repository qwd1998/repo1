package cn.itcast.day07.demo04;

public class Shixian_s implements Usb{
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");
    }
    public void dian(){
        System.out.println("鼠标点击");
    }
}
