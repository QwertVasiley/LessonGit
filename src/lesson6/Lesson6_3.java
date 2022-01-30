package lesson6;

import java.util.Scanner;

public class Lesson6_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введии число до какого сделать таблицу: ");

        //Таблица умножения треуголником

        int rows = scanner.nextInt();
        int i;
        int j;

        for ( i = 1 ;i<=rows; i++ ) {
            for (j = 1; j<=i ; j++) {

                System.out.print(j*i +" ");
            }
            System.out.println();
        }
    }
}
