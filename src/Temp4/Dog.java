package Temp4;

public class Dog implements Voice{
    private String name;
    private int age;

    public Dog (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public void Voice() {
        System.out.println("Собачка скажет гаф-гаф ");
    }

    @Override
    public void commands() {
        System.out.println("Я знаю много команд: сидеть, лежать, голос и т.д.");
    }
}
