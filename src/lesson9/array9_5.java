package lesson9;

import java.util.Scanner;

public class array9_5 {
    public static void main(String[] args) {
        //пользователь вводит размерность двухмерного массива
        // число строк==числу столбцов и заполняет через сканнер
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи число строк и столбцов которые равны");
        int size = scanner.nextInt();
        System.out.println("Enter array ");
        int [][] array = new int[size][size];


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j <array[i].length; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
    }
}
