package Temp2;

public class Scool {
    private String name;
    private int cla;
    private int age;

    public Scool (String name, int cla, int age){
        this.name = name;
        this.cla = cla;
        this.age =age;
    }


    @Override
    public String toString() {
        return "Scool{" +
                "name='" + name + '\'' +
                ", cla=" + cla +
                ", age=" + age +
                '}';
    }
}
