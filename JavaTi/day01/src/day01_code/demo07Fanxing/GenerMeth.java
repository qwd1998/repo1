package day01_code.demo07Fanxing;
/*
定义含有泛型的方法，泛型定义在方法的修饰符和返回值类型之间
格式：
    修饰符<泛型> 返回值类型 方法名（参数列表（使用泛型））{

        }
 */
public class GenerMeth {
    public static void main(String[] args) {

    }
    public  <M> void meth01(M m){
        System.out.println(m);
    }
    public static <E> void meth02(E e){
        System.out.println(e);
    }
    public static <T> void meth03(T t){

    }
}
