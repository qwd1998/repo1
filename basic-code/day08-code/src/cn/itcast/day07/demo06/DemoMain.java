package cn.itcast.day07.demo06;

public class DemoMain {
    public static void main(String[] args) {
        //创建英雄
        Hero hero = new Hero();
        hero.setName("盖伦");
        hero.setAge(22);

        //创建武器
        Weapon weapon = new Weapon("多兰剑");

        hero.setWeapon(weapon);
        hero.attack();
    }
}
