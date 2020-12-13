package cn.itcast.day07.demo02;

public class U_im implements IMPLE,IMPLEB{
    @Override
    public void methA() {
        System.out.println("sss");
        com();
        System.out.println();
    }

    @Override
    public void methB() {
        System.out.println("aaa");
        com();
        System.out.println();
    }
    private void com(){
        System.out.println("wwww");
    }
}
