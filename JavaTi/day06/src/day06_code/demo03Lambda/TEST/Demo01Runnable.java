package day06_code.demo03Lambda.TEST;

public class Demo01Runnable {
    public static void main(String[] args) {
        st(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread().getName()+"--启动了");

            }
        });
        //Runnable是函数式接口，使用Lambda表达式
        st(()->System.out.println(Thread.currentThread().getName()+"--启动了"));

    }
    public static void st(Runnable ru){
        new Thread(ru).start();
    }
}
