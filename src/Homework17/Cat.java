package Homework17;

public class Cat extends Zoo {

    public Cat(String name) {
        super(name);
    }

    @Override
    public String voice() {
        return "Meow, meow...";
    }
}
