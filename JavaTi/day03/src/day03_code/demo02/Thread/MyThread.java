package day03_code.demo02.Thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <20 ; i++) {
            System.out.println("run"+i);
            //使用Thead的sleep方法，让程序睡眠一秒钟
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName());//获取线程名称
    }
}
