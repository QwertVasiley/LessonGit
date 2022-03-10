package Lesson14;


public class CompareStringsLexicographically {
    public static void main(String[] args) {
        // Сравнить строки лексикографически
        String firstString = "Don’t take it to heart";
        String secondString = "Don’t take it to heart";
        String newFirstString = textToLowerCase(firstString);
        String newSecondString = textToLowerCase(secondString);
        System.out.println("Первый текст: " + newFirstString);
        System.out.println("Второй текст: " + newSecondString);
        stringCompare(newFirstString, newSecondString);
    }

    static String textToLowerCase(String text) {  //перевод текста в нижний регистр
        return text.toLowerCase();
    }

    public static void stringCompare(String str1, String str2) {
        System.out.println("Compair str1 & str2: " + str1.compareTo(str2));
    }
}
