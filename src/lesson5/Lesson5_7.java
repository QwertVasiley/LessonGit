package lesson5;

    // Напишите программу вывода всех четных чисел от 2 до 100 включительно

public class Lesson5_7 {
    public static void main(String[] args) {
        int i=0;
        int max = 100;
        while (i<max) {
            i=i+2;
            System.out.println(i);
        }
    }
}
