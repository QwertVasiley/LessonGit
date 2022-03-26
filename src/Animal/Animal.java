package Animal;

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Sound ");
    }

    public String getName() {
        return name;
    }
}

