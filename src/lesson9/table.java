package lesson9;

import java.util.Scanner;

public class table {
    public static void main(String[] args) {
        //таблица умножения в массиве
        Scanner scanner = new Scanner(System.in);
        System.out.print("До какого числа сделать таблицу? ");
        int num = scanner.nextInt();
        int[][] tabl = new int[num][num]; //создал массив заданного размера

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                tabl[i - 1][j - 1] = i * j;
            }
        }
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < num; j++) {
                System.out.print(tabl[i][j] + "\t");
            }
            System.out.println();
        }
    }
}