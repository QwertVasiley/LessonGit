package Lesson17;

import java.util.Objects;

public class Person {
    private static String text = "Hello from static";
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
    public void changeTxt(String newText){
        text = newText;

    }
    public void printText(){
        System.out.println(text);
    }
}
