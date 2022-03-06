package Lesson14;


import java.util.Scanner;

public class Classwork2 {
    public static void main(String[] args) {
        //есть массив строк, вывести на экран все строки
        //длинна которых больше N
        String text = "Olya has a pencil,\n" +
                "\n" +
                "Olya has a pen,\n" +
                "\n" +
                "She draws with a pencil,\n" +
                "\n" +
                "She writes with a pen.";
        String[] massLines = devisionString(text);
        Scanner scanner = new Scanner(System.in);
        int length = initLength(scanner);
        inputLines(massLines, length);
    }

    static String[] devisionString(String massLines) {
        String[] words = massLines.split("\n");
        for (String word : words) {
        }
        return words;
    }

    public static int initLength(Scanner scan) {
        System.out.print("Enter length: ");
        return scan.nextInt();
    }

    static void inputLines();

}