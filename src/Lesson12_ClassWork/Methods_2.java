package Lesson12_ClassWork;

public class Methods_2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        sum(a, b);
        String text = "text";
        int age = 5;
        display(text, age);
    }

    static void sum(int x, int y) {
        int z = x + y;
        System.out.println(z);
    }

    static void display(String name, int age) {
        System.out.println(name);
        System.out.println(age);
    }
}
