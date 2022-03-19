package Lesson17;

public class Person {
    private int age;
    private String name;

    Person(int age, String name) {
        this.age = age;
        this.name = name;

    }

    Person() {
        age = 15;
        name = "Max";
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public void show(){
        System.out.println("Age: " +age+ " name: "+ name);
    }
}
