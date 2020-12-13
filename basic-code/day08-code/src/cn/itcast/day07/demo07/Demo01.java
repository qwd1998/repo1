package cn.itcast.day07.demo07;

public class Demo01 {
    public static void main(String[] args) {
        Heroo heroo = new Heroo();
        heroo.setName("卡特琳娜");
        /*Skill skill = new Skill() {
            @Override
            public void use() {
                System.out.println("QQQQQ");
            }
        };//使用了匿名内部类
        heroo.setSkill(skill);
        heroo.attach();*/
        Shixian shixian = new Shixian();
        heroo.setSkill(shixian);
        heroo.attach();
    }
}
