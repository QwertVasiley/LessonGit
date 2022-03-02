package Lesson12_HomeWork;

import java.util.Arrays;
import java.util.Scanner;
            //создаём массив из сканера
public class ClassWorkCreateArray {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите длинну массива: ");
            int[] array = new int[initSize(scanner)];
            System.out.println("Вводим значения для массива: ");
            int[] initArray = initArray(scanner, array);

            outputArray(initArray);
        }

        static int initSize(Scanner scanner) {
            int size = scanner.nextInt();
            if (size < 0) {
                System.out.println("Error. Try again!");
                size = initSize(scanner);
            }
            return size;
        }

        static int[] initArray(Scanner scanner, int[] array) {
            for (int i = 0; i < array.length; i++) {
                array[i] = scanner.nextInt();
            }
            return array;
        }

        static void outputArray(int[] array) {
            System.out.println(Arrays.toString(array));
        }
    }

