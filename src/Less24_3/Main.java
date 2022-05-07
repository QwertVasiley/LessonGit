package Less24_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 25;
        int b;

        System.out.println("Введи делитель ");
        Scanner scanner = new Scanner(System.in);
         b = scanner.nextInt();

        try {  //проверка исключений
            int d = a/b;
            System.out.println(d);
        }catch (ArithmeticException arithmeticException) {
            while (b == 0) {
                System.out.println("Введи другое чисо");
                b = scanner.nextInt();
            }
        }finally {
            System.out.println(a/b);
        }
    }
}
