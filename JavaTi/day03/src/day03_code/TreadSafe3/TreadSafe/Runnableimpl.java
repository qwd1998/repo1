package day03_code.TreadSafe3.TreadSafe;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
Lock锁
void lock() 获取锁
void unlock()  释放锁
使用步骤：
1.在成员位置创建一个Reentrantlock对象
2.在可能出现安全问题的代码前调用Lock中的lock方法来获取锁
2.在可能出现安全问题的代码后调用LOck中的unlock方法来释放锁
 */
public class Runnableimpl implements Runnable {
    private int ticket = 100;

    //创建一个Reentranlock对象
    Lock l = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            l.lock();
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                        System.out.println(Thread.currentThread().getName() + "正在卖" + ticket + "张票");
                        ticket--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        l.unlock();
                    }
                }


            }

        }
    }
