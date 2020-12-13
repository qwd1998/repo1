package cn.itcast.day07.demo07;

public class Heroo {
    private String name;
    private Skill skill;

    public Heroo() {
    }

    public Heroo(String name, Skill skill) {
        this.name = name;
        this.skill = skill;
    }

    public String getName() {
        return name;
    }
    public void attach(){
        skill.use();
        System.out.println(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
