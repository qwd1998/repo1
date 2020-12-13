package day07_code.demo04FFyingyong;

public class ZI extends Fu{
    //子类重写父类sayHello方法

    @Override
    public void sayHello() {
        System.out.println("我是子类方法");
    }
    //定义一个方法，参数传递Greetable方法
    public void meth(Greetable g){
        g.greet();
    }
    public void show(){
        //调用meth方法，使用Lambda表达式
        meth(()->{
            super.sayHello();//因为有子父类惯性，所以一个super代表父类方法
        });
        /*
        使用super引用类的成员方法
        super是已经存在的
        父类的成员方法也是存在的
         */
        meth(super::sayHello);

        meth(()->{
            this.sayHello();
        });

        meth(this::sayHello);
    }

    public static void main(String[] args) {
        new ZI().show();

    }
}
