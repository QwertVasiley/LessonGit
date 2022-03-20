package Homework17;

public class Dog extends Zoo {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String voice() {
        return "Woof - woof";
    }
}
