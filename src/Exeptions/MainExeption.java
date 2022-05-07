package Exeptions;

import java.util.Scanner;

public class MainExeption {
    public static void main(String[] args) {

        System.out.print("Введи делимое ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.print("Введи делитель ");
        int b = scanner.nextInt();


        try {  //сдесь блок в котором возможна ошибка
            int x = a/b;
            System.out.println("Ответ: " + x);
        } catch (Exception e) { // блок который выполниться в случае ошибки
            System.out.println("На ноль не делим!");
        }
    }
}

