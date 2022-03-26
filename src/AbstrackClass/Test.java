package AbstrackClass;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.imya("Murzik");
        Dog dog = new Dog();
        dog.makeSound();
        dog.eat();
        cat.makeSound();
        cat.eat();
        Cat cat1 = new Cat();
        cat1.imya("Kotik");
        cat1.eat();
        cat1.makeSound();
    }
}

