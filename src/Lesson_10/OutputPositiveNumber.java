package Lesson_10;

import java.util.Arrays;
import java.util.Scanner;

public class OutputPositiveNumber {
    public static void main(String[] args) {
        // Вывести числа которые являются положительными
        // и кратными числу, которое ввел пользователь.
        // Вывести количество совпадений

        Scanner scanner = new Scanner(System.in);
        System.out.print("Задай длинну массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        int multiple;
        int schet = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Задай " + (i + 1) + " значение: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Весь массив: " + Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) System.out.println("Число " + array[i] + " положительное");
        }
        System.out.println("С каким числом проверить крастность? ");
        multiple = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % multiple == 0) System.out.println(array[i] + " Кратное введенному числу");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == multiple) {
                schet++;
            }
        }
        System.out.println("Кол-во повторов вашего числа: " + schet);
    }

}