package Interfases;

public class Person implements Info {
    public String name;

    public Person(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Здарова бро! ");
    }

    @Override
    public void showInfo() {
        System.out.println("Из метода Person "+ this.name);
    }
}
