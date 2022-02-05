package array;

import java.util.Scanner;
        //вводим размер массива
        //вводим значения массива
        //выводим все значения массива
public class Lesson7_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива ");
        int size = scanner.nextInt();
        int[] anArrey = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введи значение массива ");
            anArrey[i] = scanner.nextInt();
        }
        int j = 0;
        while (j < size) {
            System.out.println(anArrey[j]);
            j++;
        }
    }
}
