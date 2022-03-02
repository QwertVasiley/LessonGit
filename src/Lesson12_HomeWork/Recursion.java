package Lesson12_HomeWork;


public class Recursion {
    //считает сумму всех чисел до заданного числа
    public static void main(String[] args) {
        int result = sum(6);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}