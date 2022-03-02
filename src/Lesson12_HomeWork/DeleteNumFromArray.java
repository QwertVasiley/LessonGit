package Lesson12_HomeWork;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteNumFromArray {
    public static void main(String[] args) {
        //удалить из массива определенное число
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2};
        int[] array1 = new int[array.length - 1];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи искомое число в массиве: ");
        int numFromDel;
        numFromDel = intDel(scanner, array);
        delNum(numFromDel, array, array1);
    }

    static int intDel(Scanner scanner, int[] array) {
        int numFromDel = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numFromDel) {
                break;
            }
            if (i == array.length - 1) {
                System.out.print("Такого числа нет в массиве, введи другое число: ");
                numFromDel = intDel(scanner, array);
            }
        }
        return numFromDel;
    }

    static void delNum(int numFromDel, int[] array, int[] array1) {
        int tmp = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != numFromDel) {
                array1[tmp] = array[i];
                tmp++;
            }
        }
        System.out.println("Новый массив без твоего числа: " + Arrays.toString(array1));
    }
}
