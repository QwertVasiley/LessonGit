package Lesson14;

import java.util.Scanner;

public class FindWordsInText {
    public static void main(String[] args) {
        //Есть текст, пользователь вводит несколько слов.
        //Надо проверить, есть ли они в тексте и в каком количестве
        String originText = "Мой дядя самых лучших правил, когда не в шутку занемог, " +
                "Он уважать себя заставил и лучше выдумать не мог";
        Scanner scanner = new Scanner(System.in);
        String[] userInputArray = userTextToArray(scanner);
        originText = textToLowerCase(originText);
        originText = textNoMarks(originText);
        System.out.println("Исходный текст: " + originText);
        String[] textToArray = originalTextToArray(originText);
        int resultCons = counting(userInputArray, textToArray);
        System.out.println("Кол-во совпадений слов: " + resultCons);
    }

    static String[] userTextToArray(Scanner scanner, String... args) { //создаем массив слов пользователя
        System.out.println("Введи слова, которые ищем в тексте: ");
        String txt = scanner.nextLine();
        String[] tempArray;
        String delimeter = " ";
        tempArray = txt.split(delimeter);
        return tempArray;
    }

    static String textToLowerCase(String text) {  //перевод текста в нижний регистр
        return text.toLowerCase();
    }

    static String textNoMarks(String text) { //избавляемся от знаков препинания
        text = text.replaceAll("[^a-zA-Zа-яА-Я]", " ");
        return text;
    }

    static String[] originalTextToArray(String originTextArray) { // разбиваем изначальный текст на слова
        String[] tempArray;
        String delimeter = " ";
        tempArray = originTextArray.split(delimeter);
        return tempArray;
    }

    static int counting(String[] array1, String[] array2) {  // считаем одинаковые слова массивов
        int counter = 0;
        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i].equals(array1[j]))
                    counter++;
            }
        }
        return counter;
    }
}
