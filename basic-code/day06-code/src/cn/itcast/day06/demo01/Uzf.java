package cn.itcast.day06.demo01;
/*重写和重载：
* 重写： 方法名称一样，参数【也一样】  @Override  检验报错
* 重载： 方法名称一样，参数不一样
* 子类方法的返回值必须【小于等于】父类方法的返回值
*Object 是所有方法的祖宗：String ，char，int，long
*子类的修饰符要【大于等于】父类的修饰符  public > private
* */
public class Uzf {
    public static void main(String[] args) {
        Zi zi = new Zi();
        System.out.println(zi.num);
        System.out.println();

        zi.zii();

        System.out.println();

        Fu fu = new Fu();
        System.out.println(fu.num);
        fu.fuu();
        zi.fuu();//如果子类没有，则在父类中找
        zi.fang();
        fu.fang();

    }
}
