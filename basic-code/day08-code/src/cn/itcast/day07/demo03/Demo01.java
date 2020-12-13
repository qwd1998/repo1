package cn.itcast.day07.demo03;
/*局部内部类
* 格式：
* 修饰符 class 外部类名称{
    修饰符 返回值类型 外部类方法名称（外部类参数）{
        class 局部内部类名称{
        }
    }
}

* */
public class Demo01 {
    public void mc(){
        class Nei{  //局部内部类  修饰符什么都不写
            int num = 10;
            public void mcn(){
                System.out.println(this.num);
            }
        }
        Nei nei = new Nei();
        nei.mcn();
    }
}
