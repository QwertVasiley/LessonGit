package Lesson13;

import java.util.Scanner;

public class HomeworkSearchSymbol {
    public static void main(String[] args) {
        //Пользователь вводит букву.
        // Определить, есть ли эта буква в предложении.
        // Использовать метод класса String
        String text = "Do you like learning Java?";
        System.out.println(text);
        System.out.println();
        System.out.print("What letter to find? ");
        Scanner scanner = new Scanner(System.in);
        String symbol = scanner.nextLine();
        if (text.indexOf(symbol)==-1) System.out.println("No such letter ");
        else {
            System.out.println("Your letter number " + text.indexOf(symbol));
        }
    }
}
