package Lesson16;

public class Cat {
    String name;
    int age;
    String color;


    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Cat(String name, String color){
        this.name = name;
        this.color = color;
    }
    public static void main(String[] args) {
        Cat Tihon = new Cat("Tishka", 3);

        Cat Vasil = new Cat("Vasiley", 4);

        Cat Murzilka = new Cat("Murzilka", "Gray");

        System.out.println("Котику " + Tihon.age + " лет" + " Его зовут " + Tihon.name);
        System.out.println("Котику " + Vasil.age + " лет" + " Его зовут " + Vasil.name);
        System.out.println(Murzilka.color + " " + Murzilka.name);

    }
}