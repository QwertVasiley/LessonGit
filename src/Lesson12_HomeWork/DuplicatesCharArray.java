package Lesson12_HomeWork;

public class DuplicatesCharArray {
    public static void main(String[] args) {
        //Найти дубликаты в массиве CHAR
        char[] charArray = new char[]{'h', 'i', 'd', 'b', 'e', 'k', 's', 'h', 's'};
        searchDuplicates(charArray);
    }

    static void searchDuplicates(char[] charArray) {
        for (int i = 0; i < charArray.length; i++) {
            for (int j = 0; j < i; j++) {
                if (charArray[j] == charArray[i])
                    System.out.println("Повторяется буква: " + charArray[j] + " ");
            }
        }
    }
}

