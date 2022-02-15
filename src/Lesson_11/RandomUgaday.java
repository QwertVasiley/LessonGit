package Lesson_11;
import java.util.Random;
import java.util.Scanner;
public class RandomUgaday {
    public static void main(String[] args) {
        System.out.println("Я загадал число от 0 до 9, \nа ты с трех попыток попробуй его угадать!");
        int i = 3;
        Random random = new Random();
        int compNumber = random.nextInt(0, 9);
        Scanner scanner = new Scanner(System.in);
        int userNumber = scanner.nextInt();

        while (userNumber != compNumber & i > 1) {
                System.out.println("Я загадал другое, осталось " + (i-1) + " попытки ");
                System.out.print("Попробуй еще раз ");
                i--;
                userNumber = scanner.nextInt();

        }
        if (userNumber==compNumber) System.out.println("А ты молодец! Мое число было: " + compNumber);
        if (userNumber!=compNumber) System.out.println("Ты проиграл! Мое число было: " + compNumber);
    }
}
