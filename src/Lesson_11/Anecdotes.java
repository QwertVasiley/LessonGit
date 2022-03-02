package Lesson_11;

import java.io.FileReader;
import java.util.Scanner;


public class Anecdotes {
    //считываем анекдоты из TXT
    public static void main(String[] args) throws Exception {

        String newAnek = "- NEW -";
        String andLabel = "- FINAL -";
        int schetAneс = 0; // соберет значение кол-ва анекдотов
        int[] lineSchetAnec = new int[schetAneс];  // собирает количество строк каждого анекдота в отдельности


        String text = "";
        FileReader readTxt = new FileReader("src/Lesson_11/Anecdotes.dat");
        Scanner textAnek = new Scanner(readTxt);

        int j;
        for (j = 1; j > 0; j++) {
            text = textAnek.nextLine();
            if (newAnek.equals(text)) {
                schetAneс++;
            }
            if (andLabel.equals(text)) break;
        }
        System.out.println("В базе " + schetAneс + " анекдотов");  //Посчитанное количество анекдотов

        FileReader readTxt2 = new FileReader("src/Lesson_11/Anecdotes.dat");
        Scanner textAnek2 = new Scanner(readTxt2);

        String[] buffer = new String[j];
        int kolvo = 0;
       // lineSchetAnec[schetAneс] =0;
        int i;

        for (i = j; i > 0; i--) {

            text = textAnek2.nextLine();
            buffer[kolvo] = text;
            kolvo++;
//            if (newAnek.equals(text)){
//            lineSchetAnec[]
        }
        System.out.println(kolvo + " Kolvo");
        System.out.println("Введи число от 0 до " + (j - 13));
        Scanner scanner = new Scanner(System.in);
        int request = scanner.nextInt();

        while (buffer[request].intern() != newAnek) {
            request++;
        }
        request++;
        while (buffer[request].intern() != newAnek) {
            System.out.println(buffer[request]);
            request++;
        }
    }
}


