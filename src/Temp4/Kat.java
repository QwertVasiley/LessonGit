package Temp4;

public class Kat implements Voice {
    private String name;
    private int age;

    public Kat(String name,  int age){
        this.name = name;
        this.age = age;

    }

    @Override
    public String toString() {
        return "Zveri{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    @Override
    public void Voice() {
        System.out.println("Кошка скажет мяууу");
    }

    @Override
    public void commands() {
        System.out.println("Defoult ответ котика ");
    }
    public void comMiy (){
        System.out.println("Miy-Miy");
    }
    public void comSeatDown (){
        System.out.println("Я же кошка и могу только спать и жрать");
    }

}
