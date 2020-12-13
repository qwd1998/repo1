package day07_code.demo02FFyingyong;

/*
通过对象名引用成员方法；
使用前提是对象名已经存在，成员方法也是存在的
就可以用对象名来引用成员方法
 */
public class Demo01CeShi {
    public static void main(String[] args) {
        //调用printString方法是一个函数式接口，可以调用Lambda表达式
        printString((s)->{
            //创建RerObject对象
            Demo01RerObject rb = new Demo01RerObject();
            rb.tS(s);
        });

        //使用方法引用，对象已经存在，成员方法也是已经存在的，所以我们可以使用对象名引用成员方法
        Demo01RerObject rb = new Demo01RerObject();
        printString(rb::tS);
    }
    public static void printString(Printable p){
        p.print("Hello");
    }
}
