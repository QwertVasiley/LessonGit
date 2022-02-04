package lesson6;

import java.util.Scanner;

public class Random {

         //RANDOME

        public static void main (String[]args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число: ");
            int number = scanner.nextInt();
            java.util.Random random = new java.util.Random();
            int randomNumber = random.nextInt(-100000000, 100000000);
            String text = number < randomNumber ? "меньше" : number > randomNumber ? "больше" : "равно";
            System.out.println("Рандомное число: " + randomNumber);
            System.out.println("Введённое число " + text + " чем рандомное.");
        }
    }
