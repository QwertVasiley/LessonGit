package Lesson_11;

public class CharArrayDuplicates {
    public static void main(String[] args) {
        //найти повторы в массиве Char
        char[] charArray = new char[]{'h', 'i', 'd', 's', 'e', 'k', 'm', 'h', 's'};
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (charArray[j] == charArray[i])
                    System.out.println("Повторяется буква: " + charArray[j] + " ");
            }
        }
    }
}