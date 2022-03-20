package Animal;

public class Main {
    public static void main(String[] args) {
    Zoo zoo = new Zoo();
    zoo.addAnimal(new Dog("Max"));
    zoo.addAnimal(new Cat("Felix"));
    zoo.sound();
    }
}
