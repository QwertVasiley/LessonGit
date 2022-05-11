package Lesson25_HomeArray;

public class Main {
    public static void main(String[] args) {
        //создать два потока. Первый ищет второй по величине элемент массива,
        // второй ищет второй по меньшинству элемент массива

        int[] array = {15, 7, 6, 12, 4, 80, 15, 66, 33, 18, 20, 9};

        MaxSecond maxSecond = new MaxSecond(array);

        MinSecond minSecond = new MinSecond(array);
        maxSecond.start();
        minSecond.start();
    }
}

