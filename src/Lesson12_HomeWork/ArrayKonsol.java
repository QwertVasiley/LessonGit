package Lesson12_HomeWork;

import java.util.Scanner;

public class ArrayKonsol {
    public static void main(String[] args) {
        //Заполнить массив с консоли
        //Если пользователь ввел отриццательное число, то
        //прекратить инициализацию массива, наругаться на пользователя
        //Вывести полученный массив с помощью FOREACH
        System.out.print("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[intsize(scanner)];
        int[] intArray = intArray(scanner, array);
        outputArray(intArray);
    }
    static int intsize(Scanner scanner) {
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Enter еще раз");
            size=intsize(scanner);
        }
        return size;
    }
    static int[] intArray(Scanner scanner, int[] array) {
        System.out.println("Введи значения для массива");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    static void outputArray(int[] array) {
        for (int temp : array) {
            System.out.print(temp + "\t");
        }
    }
}
