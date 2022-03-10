package Lesson14;

public class CountingWords {
    public static void main(String[] args) {
        //Посчитать кол-во слов в тексте
        String text = "My dear, dear Mummy, I love you very much! I want you to be happy On the eighth of March!";
        int number = schet(text);
        System.out.println("Кол-во слов в тексте: " + number);
    }

    static int schet(String text) {
        int tmp = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ')
                tmp++;
        }
        return tmp;
    }
}
