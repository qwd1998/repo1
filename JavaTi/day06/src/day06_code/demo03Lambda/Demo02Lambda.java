package day06_code.demo03Lambda;
/*
使用Lambda优化日志案例
Lambda的特点：延迟加载
Lambda的使用前提，必须存在函数式接口
 */
public class Demo02Lambda {
    public static void main(String[] args) {
        String msg1 = "Hellow";
        String msg2 = "World";
        String msg3 = "Java";
        //参数MessageBuilder是函数式接口，使用Lambda表达式
        show01(1,()->{
            return msg1+msg2+msg3;
        });

    }
    public static void show01(int level,MessageBuilder me){
        //对日志的等级进行判断，如果是一级，则调用接口中的方法、
        //调用方法才会对字符串进去拼接，如果不是一级，接口中的方法不会执行，不会存在性能的浪费
        if(level==1){
            System.out.println(me.builedr());
        }
    }
}
