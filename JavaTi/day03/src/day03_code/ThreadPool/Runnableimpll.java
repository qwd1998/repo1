package day03_code.ThreadPool;

public class Runnableimpll implements  Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"创建了一个新的线程");
    }
}
