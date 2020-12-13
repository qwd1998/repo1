package day03_code.TreadSafe2.TreadSafe;

/*
第二种方法，同步方法
   把访问了共享数据的代码抽取出来，放入一个方法中，
   在方法上放上synchronized修饰符

修饰符  synchronized  返回值类型 方法名称 （参数列表）{
    可能出现线程安全问题的代码（访问了共享数据的代码）
    }
 */
public class Runnableimpl implements Runnable {
    private int ticket = 100;


    @Override
    public void run() {
        while (true) {
            payTicket();

        }
    }
    public synchronized void payTicket(){
        if (ticket > 0) {

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "正在卖" + ticket + "张票");
            ticket--;
        }
    }
}
