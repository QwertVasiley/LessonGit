package Lesson25;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
            //создать 3 потока
            //создать матрицу Randome
            //вывести главную и побочную диагональ матрицы


        Random random = new Random();

        int[][] matrix  = new int [100][100];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix [i][j] = random.nextInt(1000);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        Diagon1 diagon1 = new Diagon1(matrix);
        Diagon2 diagon2 = new Diagon2(matrix);


        diagon1.start();
        diagon2.start();

    }
}
