package Lesson12_ClassWork;

public class Methods_7 {
    // Показанно, как происходит обращение к тому или иному методу
    // возвращает значение операций в первый метод
    public static void main(String[] args) {
        System.out.println(sum(2, 3));
        System.out.println(sum(4.5, 3.2));
        System.out.println(sum(4, 3, 7));
    }

    static int sum(int x, int y) {
        return x + y;
    }

    static double sum(double x, double y) {
        return x + y;
    }

    static int sum(int x, int y, int z) {
        return x + y + z;
    }
}