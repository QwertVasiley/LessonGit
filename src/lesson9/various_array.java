package lesson9;

import java.util.Scanner;

public class various_array {
    //ввод со сканнера неровного массива
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи кол-во ячеек для массива: ");
        int size = scanner.nextInt();
        int [] strArray = new int[size];
        System.out.println("вводи числа для массива: ");

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = scanner.nextInt();
        }
        for (int i = 0; i < size; i++) {
            System.out.print(strArray[i]+" ");
        }
    }

}