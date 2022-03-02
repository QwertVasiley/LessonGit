package Lesson12_HomeWork;

import java.util.Scanner;

public class OutPositiveNum {
    public static void main(String[] args) {
        // Вывести числа которые являются положительными
        // и кратными числу, которое ввел пользователь.
        // Вывести количество совпадений

        System.out.print("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[intsize(scanner)];
        int[] intArray = intArray(scanner, array);
        positive(intArray);
        multipleDuplic(intArray);
        outputArray(intArray);
    }

    static int intsize(Scanner scanner) { //проверка на отрицательное число
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Enter еще раз");
            size = intsize(scanner);
        }
        return size;
    }

    static int[] intArray(Scanner scanner, int[] array) { //заполнение массива
        System.out.println("Введи значения для массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static void positive(int[] array) { //нахождение положительных чисел в массиве
        System.out.print("Положительные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) System.out.print(array[i] + "\t");
        }
        System.out.println();
    }

    static void multipleDuplic(int[] array) { //Проверка на кратность и повторы с вводимым числом
        System.out.println("С каким числом проверить крастность? ");
        Scanner scanner = new Scanner(System.in);
        int givenNum = scanner.nextInt();
        System.out.print("Кратные числа: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % givenNum == 0) System.out.print(array[i] + "\t");
        }
        System.out.println();
        int schet = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == givenNum) {
                schet++;
            }
        }
        System.out.println("Повторов твоего числа " + schet);
    }

    static void outputArray(int[] array) { //Вывод массива
        System.out.println("Твой массив: ");
        for (int temp : array) {
            System.out.print(temp + "\t");
        }
    }
}
