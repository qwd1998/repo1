package day07_code.demo06FFyingyong;

public class Perso {
    private String name;

    public Perso(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Perso() {
    }

    @Override
    public String toString() {
        return "Perso{" +
                "name='" + name + '\'' +
                '}';
    }
}
