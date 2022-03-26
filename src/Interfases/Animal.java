package Interfases;

public class Animal implements Info {
    public int number;

    public Animal(int number) {

        this.number = number;
    }

    public void sleeping() {
        System.out.println("Я уже сплю ");
    }

    @Override
    public void showInfo() {
        System.out.println("Из класса Animal " + this.number);
    }
}
