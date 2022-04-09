package Lesson21_3;

public class Dog implements Animal{
    private String name = "Barbos";

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("Gaff Gaff ");
    }

    @Override
    public void food() {
        System.out.println("Pedi gree...");
    }
}
