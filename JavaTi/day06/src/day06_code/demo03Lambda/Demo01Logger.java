package day06_code.demo03Lambda;
/*
日志案例：
发现以下代码船长的一些性能浪费的问题
先拼接字符串，再判断level是不是1，如果不是，则字符串白拼接了
 */
public class Demo01Logger {
    public static void main(String[] args) {
        String msg1 = "Hellow";
        String msg2 = "World";
        String msg3 = "Java";
        me(1,msg1+msg2+msg3);
    }
    public static void me(int level,String message){
        if(level==1){
            System.out.println(message);
        }
    }

}
