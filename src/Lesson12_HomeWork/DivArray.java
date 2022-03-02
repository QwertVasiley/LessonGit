package Lesson12_HomeWork;

public class DivArray {
        // Класс, собирает длинну для array1 & array2
    public int[] array1;
    public int[] array2;

    public DivArray(int length) {
        if (length % 2 == 0) {
            array1 = new int[length / 2];
            array2 = new int[length / 2];
        } else {
            array1 = new int[length / 2 + 1];
            array2 = new int[length / 2];
        }
    }
}

