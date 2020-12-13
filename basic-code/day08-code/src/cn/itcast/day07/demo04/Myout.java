package cn.itcast.day07.demo04;
/*局部内部类，如果希望访问所在方法的局部变量，那么这个局部变量必须是有效final
*
* */

public class Myout {
    public void meth(){
        int num = 10;
        class MyInner{
            public void methn(){
                System.out.println(num);
            }
        }
    }
}
