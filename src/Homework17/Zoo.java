package Homework17;

public class Zoo {

    private String name;
    private int number;
    static int counter = 1;

    public Zoo(String name) {
        this.name = name;
    }

    public Zoo() {
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public String voice() {
        return "Voice";
    }

    public void add(Zoo animal) {
        number = counter++;
        System.out.print(animal);
        System.out.println(animal.voice());
    }

    public void soundOff() {
        System.out.println("This zoo has " + number + " animals.");
    }

    @Override
    public String toString() {
        return name + " says ";
    }
}
