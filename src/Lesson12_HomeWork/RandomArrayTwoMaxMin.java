package Lesson12_HomeWork;

import java.util.Random;
import java.util.Scanner;

public class RandomArrayTwoMaxMin {

    //Заполнить массив Random-ными числами
    //Вывести второй максимальный и минимальный элемент

    public static void main(String[] args) {
        System.out.print("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[intsize(scanner)];
        System.out.println("Указываем диапозон чисел для массива: ");
        int start = range();
        int end = range();
        int[] intArray = intArray(start, end, array);
        System.out.println("Создался массив: ");
        outputArray(intArray);
        regularizeArray(array);
        System.out.println("Выстроенный массив: ");
        outputArray(intArray);
        outputTwoMaxMin(intArray);
    }

    static int intsize(Scanner scanner) {
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Enter еще раз");
            size = intsize(scanner);
        }
        return size;
    }

    static int range() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    static int[] intArray(int start, int end, int[] array) {
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int rndNum = start + random.nextInt(end - start + 1);
            array[i] = rndNum;
        }
        return array;
    }

    static void outputArray(int[] array) {
        for (int temp : array) {
            System.out.print(temp + "\t");
        }
        System.out.println();
    }

    static int[] regularizeArray(int[] array) {
        int tmp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    static void outputTwoMaxMin(int[] array) {
        System.out.println("Второе минимальное: " + array[1] + " Второе максимальное: " + array[array.length - 2]);
    }
}