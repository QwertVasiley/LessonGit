package Lesson14;

public class SplitStringIntoWords {
    public static void main(String[] args) {
        //делим текст строки на слова в массив слов
        String text = "I am       ,    learning java   ! programming";

        String[] words = text.split("\\s*(\\s|,|!|\\.)\\s*"); // "\\s" - указывает на пробел в любом количестве,
        // в скобках через || указываем символы которые могут следовать за пробелами

        for (String wor : words) {
            System.out.println(wor);
        }
    }
}
