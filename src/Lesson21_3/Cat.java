package Lesson21_3;

public class Cat implements Animal{
    private String name = "Murka";

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Mieu...");
    }

    @Override
    public void food() {
        System.out.println("Wiskas murrr...");
    }
}
