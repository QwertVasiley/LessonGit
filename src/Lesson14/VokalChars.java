package Lesson14;

import java.util.Arrays;
import java.util.Scanner;

public class VokalChars {
    public static void main(String[] args) {
        // 1) пользователь вводит текст. посчитать количество гласных букв
        // 2) посчитать кол-во согласных букв

        char[] vocalArrEng = new char[]{'a', 'e', 'i', 'o', 'u', 'y'}; //массив гласных букв English
        char[] consArrEng = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'z'};
        Scanner scanner = new Scanner(System.in);
        String text = inputText(scanner);
        String textLowerCase = textToLowerCase(text);
        char[] textArray = textToArray(textLowerCase);
        System.out.println(Arrays.toString(textArray));
        int resultVokal = counting(vocalArrEng, textArray);
        System.out.println("Letter vokal: " + resultVokal);
        int resultCons = counting(consArrEng, textArray);
        System.out.println("Letter consonants: " + resultCons);

    }

    static String inputText(Scanner scanner) {  //воод текста с консоли
        System.out.println("Input Text: ");
        return scanner.nextLine();
    }

    static String textToLowerCase(String text) {  //перевод текста в нижний регистр
        return text.toLowerCase();
    }

    static char[] textToArray(String line) {  // перевод текста в массив символов
        char[] textArray = new char[line.length()];
        textArray = line.toCharArray();
        return textArray;
    }

    static int counting(char[] arrayLetter, char[] textArray) {  // находим одинаковые символы масиивов и считаем их
        int counter = 0;
        for (int i = 0; i < textArray.length; i++) {
            for (int j = 0; j < arrayLetter.length; j++) {
                if (textArray[i] == arrayLetter[j])
                    counter++;
            }
        }
        return counter;
    }
}
