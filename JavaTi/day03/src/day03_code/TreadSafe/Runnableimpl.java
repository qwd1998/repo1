package day03_code.TreadSafe;

/*
同步代码块
synchronized（锁对象）{
    可能出现线程安全问题的代码（访问了共享数据的代码）
    }
   注意：1.通过代码块中的锁对象，可以使用任意的对象
        2.但是必须保证多个线程使用的锁对象是同一个
        3.锁对象作用：
            把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class Runnableimpl implements Runnable {
    private int ticket = 100;

    //创建一个锁对象
    Object obj = new Object();


    @Override
    public void run() {
        while (true) {
            //创建同步代码块
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println(Thread.currentThread().getName() + "正在卖" + ticket + "张票");
                    ticket--;

                }
            }
        }
    }
}