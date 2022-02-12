package lesson9;

import java.util.Scanner;

public class array9_1 {
    public static void main(String[] args) {
        //создать массив строк с помощью сканнера
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи кол-во ячеек для массива: ");
        int size = scanner.nextInt();
        String[] strArray = new String[size];
        System.out.println("вводи слова для заполнения массива");

        for (int i = 0; i < strArray.length; i++) {
            strArray[i] = scanner.next();
        }
        for (int i = 0; i < size; i++) {
            System.out.println(strArray[i]);
        }
    }

}
