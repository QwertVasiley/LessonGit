package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

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
        else {}
    }
}
