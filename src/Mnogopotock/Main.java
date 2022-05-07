package Mnogopotock;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ivan", "VAsil", "Dimon");
        Person person1 = new Person("Sveta", "Olga", "Ann");
        Person person2 = new Person("Kirill", "Slava", "Artem");

        person.start();
        person1.start();
        person2.start();
    }
}
