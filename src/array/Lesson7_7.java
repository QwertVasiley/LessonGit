package array;

import java.util.Scanner;

public class Lesson7_7 {
    public static void main(String[] args) {

        //есть массив, пользователь вводит число
        // определить есть ли это число в массиве

        Scanner scanner = new Scanner(System.in);
        int[] anArray = {1, 2, 3, 6, 8, 4, 45, 12, 46, 7, 20};
        int i=0;
        System.out.println("Введи число которое сравним с массивом");
        int userIn = scanner.nextInt();
        do {
            if (userIn == anArray[i]) {
                System.out.println("В массиве есть число " + anArray[i]);
                break;
            }
            if (anArray.length==i+1) {
                System.out.println("Нет такого числа");
            }
            i++;

        } while (i < anArray.length);

    }

}
