package cn.itcast.day07.demo04;

public class Demo01 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.powerOn();
        //准备一个鼠标 多态
        Usb us = new Shixian_s();
        //u.open();
        computer.useDevice(us);
        Usb uu = new Shixian_j();
        computer.useDevice(uu);
        computer.powerOff();
    }
}
