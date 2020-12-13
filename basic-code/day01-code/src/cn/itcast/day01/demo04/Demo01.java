package cn.itcast.day01.demo04;
/*比较两个数据是否相等 两个byte 两个short
        System.out.println();也是重载
*/
public class Demo01 {
    public static void main(String[] args) {
       /* byte a = 10;
        byte b = 11;*/

        System.out.println(isSame((long)10,(long) 11));
        System.out.println(isSame((short)10,(short) 11));
        System.out.println(isSame(10,10));
        System.out.println(isSame((byte)10,(byte) 11));
    }
    public static boolean isSame(byte a, byte b){
        System.out.println("byte");
        boolean same;
        if(a == b){
            same = true;

        }else{
            same = false;
              }
        return same;

    }

    public static boolean isSame(int a, int b){
        System.out.println("int");
        boolean same;
        if(a == b){
            same = true;

        }else{
            same = false;
        }
        return same;

    }
    public static boolean isSame(short a, short b){
        System.out.println("short");
        boolean same = a == b ? true:false;
        /*if(a == b){
            same = true;

        }else{
            same = false;
        }*/
        return same;
    }
    public static boolean isSame(long a, long b){
        System.out.println("long");
        /*boolean same;
        if(a == b){
            same = true;

        }else{
            same = false;
        }*/
        return a == b;
    }
}
