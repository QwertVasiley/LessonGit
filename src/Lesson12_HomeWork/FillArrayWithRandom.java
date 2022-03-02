package Lesson12_HomeWork;

import java.util.Random;
import java.util.Scanner;

public class FillArrayWithRandom {

    //Заполнить массив Random-ными числами

    public static void main(String[] args) {
        System.out.print("Введите длинну массива: ");
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[intsize(scanner)];
        System.out.println("Указываем диапозон чисел для массива: ");
        int start = range();
        int end = range();
        int[] intArray = intArray(start, end, array);
        outputArray(intArray);

    }

    static int range() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        return a;
    }

    static int intsize(Scanner scanner) {
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Enter еще раз");
            size = intsize(scanner);
        }
        return size;
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
    }
}

