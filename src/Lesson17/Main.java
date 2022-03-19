package Lesson17;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.show();
        Person dimon = new Person(31, "Dimon");
        dimon.show();
        person.changeTxt("The wether is Good");
        person.printText();
        dimon.printText();
    }
}
