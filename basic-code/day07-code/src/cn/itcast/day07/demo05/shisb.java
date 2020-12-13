package cn.itcast.day07.demo05;

public class shisb implements USB {

    @Override
    public void open() {
        System.out.println("打开鼠标，准备大事");
    }

    @Override
    public void speak() {
        System.out.println("给每个发狗头的点赞，并说明我点我儿子");
    }
    @Override
    public void close() {
        System.out.println("关闭鼠标，准备跑路");
    }
    public void sss(){
        System.out.println("带货主播疯狂点赞");
    }
}
