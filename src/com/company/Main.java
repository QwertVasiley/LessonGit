package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

// Пользователь вводит 3 числа. Найти максимальное и вывести его
// Способ 1

        Scanner scanner = new Scanner(System.in);
        System.out.print("In first number: ");
        int first = scanner.nextInt();
        System.out.print("In second number: ");
        int second = scanner.nextInt();
        System.out.print("In third number: ");
        int third = scanner.nextInt();

        if (first > second && second > third)
        {
            System.out.println("Большее число : " +first);
        }
        if (first < second && second > third)
        {
            System.out.println("Большее число : " +second);
        }
        if (first < second && second < third)
        {
            System.out.println("Большее число : " +third);
        }
        if (first > second && second < third & third > first)
        {
            System.out.println("Большее число : " +third);
        }
        if (first == second && second == third)
        {
            System.out.println("Все числа одинаковы и равны :" +first);
        }
        if (first == second && second > third)
        {
            System.out.println("Первые и второе число имеют одинаковое значение " +first +" и больше последнего");
        }
        if (first < second && second == third)
        {
            System.out.println("Два последних числа имеют одинаковое значение " +third +" и больше первого");
        }
        if (first>second && first == third)
        {
            System.out.println("Первое и третье число имеют одинаковое значение " +first + " и больше второго");
        }
        if (first == second && second < third)
        {
            System.out.println("Большее число : " +third);
        }
        if (first > second && second == third)
        {
            System.out.println("Большее число : " +first);
        }
        else {}
    }
}

        // Второй способ

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("In first number: ");
//        int first = scanner.nextInt();
//        System.out.print("In second number: ");
//        int second = scanner.nextInt();
//        System.out.print("In third number: ");
//        int third = scanner.nextInt();
//
//        if (first > second && second > third) System.out.println("Большее число : " +first);
//        if (first < second && second > third) System.out.println("Большее число : " +second);
//        if (first < second && second < third) System.out.println("Большее число : " +third);
//        if (first > second && second < third & third > first) System.out.println("Большее число : " +third);
//        if (first == second && second == third) System.out.println("Все числа одинаковы и равны " +first);
//        if (first == second && second > third) System.out.println("Первые и второе число имеют одинаковое значение " +first +" и больше последнего");
//        if (first < second && second == third) System.out.println("Два последних числа имеют одинаковое значение " +third +" и больше первого");
//        if (first>second && first == third) System.out.println("Первое и третье число имеют одинаковое значение " +first + " и больше второго");
//        if (first == second && second < third) System.out.println("Большее число : " +third);
//        if (first > second && second == third) System.out.println("Большее число : " +first);
//
//    }
//}
