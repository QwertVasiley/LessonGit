package lesson5;

import java.util.Scanner;

// цикл While
public class Lesson5_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        double sum = 0;
        double i = 1;

        while (i<=inputNum){
          sum += 1/i;
        i++;
        }
        System.out.println(sum);
    }
}
