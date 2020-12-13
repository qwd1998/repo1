package cn.itcast.day07.demo01;

public class U_defaultB implements Default {
    @Override
    public void methodAbs() {

        System.out.println("实现类方法B");
    }
    @Override
    public void methoDefault(){
        System.out.println("实现类B覆盖重写了默认方法");
    }
}
