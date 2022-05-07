package Lesson24_2;

import java.util.Scanner;

public class Int_error {
    public static void main(String[] args) {

        int a = 25;
        System.out.println("Введи делитель ");
        Scanner scanner = new Scanner(System.in);
        int b = scanner.nextInt();

       try {
           int d = a/b;
           System.out.println(d);
       }catch (ArithmeticException arithmeticException){
           System.out.println("Не делим на ноль");
       }

    }
}
