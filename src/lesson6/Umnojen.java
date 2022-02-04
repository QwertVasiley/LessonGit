package lesson6;

import java.util.Scanner;

public class Umnojen {
    public static void main(String[] args) {

        //Таблица умножения до заданного числа, квадратная

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введии число до какого сделать таблицу: ");

        int rows = scanner.nextInt();
        int i;
        int j;

        for ( i = 1 ;i<=rows; i++ ) {
            for (j = 1; j<=rows ; j++) {

                System.out.print(j*i +"\t"); //сделал табуляцию, для красоты
            }
            System.out.println();
        }
    }
}





