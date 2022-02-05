package array;

import java.util.Scanner;

public class Lesson7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи размер массива ");
        int size = scanner.nextInt();
        double[] anArrey = new double[size];
        double summa = 0;
        for (int i = 0; i < size; i++) {
            System.out.println("Введи значение массива ");
            anArrey[i] = scanner.nextDouble();
            summa += anArrey[i];
        }
        int j = 0;
        while (j < size) {
            System.out.println(anArrey[j]);
            j++;
        }

        System.out.printf("%.2f", summa / size); //в кавычках написано сколько символов после запятой выводить
    }
}

