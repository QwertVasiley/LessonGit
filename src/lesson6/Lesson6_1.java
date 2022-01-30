package lesson6;

import java.util.Scanner;

public class Lesson6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input n:  ");
        int n = scanner.nextInt();
        int fib1 = 1;
        int fib2 = 1;
        int sum = 1;
        int i;
        int allSumm=2;
        for (i = 0; i <=n; i++) {

            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
            allSumm = allSumm+sum;
            System.out.println(sum + " ");
        }
        System.out.println(allSumm + " Сумма");
    }
}
