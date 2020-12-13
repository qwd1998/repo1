package cn.itcast.day07.demo01;

import org.w3c.dom.ls.LSOutput;

public class Tobao {
    Tlei t = new Tlei();
    public void mech(){
        System.out.println(t.n);  //n为private不能访问
    }
}
