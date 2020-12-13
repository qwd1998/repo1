package day03_code.TreadSafe2.TreadSafe;

public class Demo01Ticket {
    public static void main(String[] args) {
        Runnable r = new Runnableimpl();
        Thread t = new Thread(r);
        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);

        t1.start();

        t.start();

        t2.start();
    }
}
