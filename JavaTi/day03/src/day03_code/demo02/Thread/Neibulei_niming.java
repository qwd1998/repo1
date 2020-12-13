package day03_code.demo02.Thread;

public class Neibulei_niming {
    public static void main(String[] args) {
        //线程的父类是Thread
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+i);
                }
            }
        }.start();
    }
}
