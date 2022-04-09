package Lesson21_3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Map<String, Animal> map = new HashMap<>();

        Dog dog = new Dog();
        Cat cat = new Cat();

        map.put(dog.getName(), dog);
        map.put(cat.getName(), cat);

        System.out.println("Enter name ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        for (Map.Entry<String, Animal> entry : map.entrySet()) {
            if (entry.getKey().equals(name)) {
                entry.getValue().makeSound();
                entry.getValue().food();
            }
        }
    }
}
