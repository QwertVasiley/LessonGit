package Lesson_10;

import java.util.Arrays;
import java.util.Scanner;

public class FillArray {
    public static void main(String[] args) {
        //Заполнить массив с консоли
        //Если пользователь ввел отриццательное число, то
        //прекратить инициализацию массива, наругаться на пользователя
        //Вывести полученный массив с помощью FOREACH
        System.out.print("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.print("Твоё " + (i + 1) + " значение: ");
            array[i] = scanner.nextInt();
            if (array[i] < 0) {
                System.out.println("Вы ввели отриццательное число");
                break;
            }
        }
        for (int temp : array) {
            System.out.print(temp + "\t");
        }
    }
}
