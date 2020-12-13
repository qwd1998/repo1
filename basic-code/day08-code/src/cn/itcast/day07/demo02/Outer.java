package cn.itcast.day07.demo02;
/*如果出现重名现象，那么格式就是  外部类名称.this.外部类成员变量*/
public class Outer {
    int num = 10;
    public class Inner{
        int num = 20;
        public void meI(){
            int num = 30;
            System.out.println(num);//30
            System.out.println(this.num);//20
            System.out.println(Outer.this.num);//10
        }

    }

}
