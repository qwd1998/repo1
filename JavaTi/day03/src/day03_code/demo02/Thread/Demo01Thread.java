package day03_code.demo02.Thread;
/*
start只能执行一次，多次使用是非法的
Mythread必须重写Thread的run方法
 */
public class Demo01Thread {
    public static void main(String[] args) {
        Thread myThread = new MyThread();
        myThread.start();//开启多线程
        //new MyThread().start();
        System.out.println(Thread.currentThread().getName());//获取当前线程的名称

        for (int i = 0; i <20 ; i++) {
            System.out.println("main："+i);
        }
        System.out.println(myThread.getName());
    }
}
