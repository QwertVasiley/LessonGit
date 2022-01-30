package lesson5;

import java.util.Scanner;

public class Palindrom {
    //строка читается в обе строны одинаково?
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи строку для проверки на палиндром: ");
        String stroka = scanner.nextLine();
        String reverse = new StringBuffer(stroka).reverse().toString(); //делает ресерс строки
        System.out.println(stroka + " до переворота");
        System.out.println(reverse + " после переворота");
        if (stroka.equals(reverse)) {
        System.out.println("GOOOD");
        }else System.out.println("BEAD");
    }
}
