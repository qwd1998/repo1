package day03_code.ThreadPool;

import java.lang.reflect.Executable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
java.util.concurrent.Executors  线程池的工厂类，用来生产线程
static ExecutorService newFixedThreadPool(int nThreads)
          创建一个可重用固定线程数的线程池，以共享的无界队列方式来运行这些线
      参数： int nThread：创建线程池中包含的线程数量
      返回值：ExecutorService接口，返回的是ExecutorService接口的实现类对象

      线程池的使用步骤：1.使用线程池的工厂类Executors里边提供的的静态方法newFixedThreadPool生产一个指定线程数量的线程池从
      2.创建一个类，实现Runnable接口，重写run方法，设置线程任务
      3.调用Executors中的方法submit，传递线程任务，开启线程，执行run方法

 */
public class ThreadPoold {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(3);
        es.submit(new Runnableimpll());
        es.submit(new Runnableimpll());
        es.submit(new Runnableimpll());



    }

}
