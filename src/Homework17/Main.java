package Homework17;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.add(new Dog("Rex"));
        zoo.add(new Cat("Felix"));
        zoo.add(new Pig("Peppa"));
        zoo.soundOff();
    }
}
