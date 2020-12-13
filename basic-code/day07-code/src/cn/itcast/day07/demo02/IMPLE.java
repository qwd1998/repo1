package cn.itcast.day07.demo02;

import java.security.PublicKey;

public interface IMPLE {
    public abstract void methA();
    public static void methc(){
        System.out.println("HAOASD");
    }
    default void  methd(){
        System.out.println("6565");
    }
}
