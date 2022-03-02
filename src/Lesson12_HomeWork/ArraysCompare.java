package Lesson12_HomeWork;

public class ArraysCompare {
    public static void main(String[] args) {
        //сравнить массивы на равенсво
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
        arrayCompare(array1, array2);
        outputArrays(array1, array2);
    }

    static void arrayCompare(int[] array1, int[] array2) {
        boolean a = true;

        if (array1.length != array2.length) { //сравнение длинн масивов
            a = false;
        }
        for (int i = 0; i < array1.length && a == true; i++) {
            if (array1[i] != array2[i]) { //сравнение содержимого в соответсвующих индексах
                a = false;
            }
        }
        if (a == true) System.out.println("Good Arrays");
        if (a == false) System.out.println("Bead Arrays");
    }

    static void outputArrays(int[] array1, int[] array2) {
        System.out.print("Первый массив: ");
        for (int temp : array1) {
            System.out.print(temp + "\t");
        }
        System.out.println();
        System.out.print("Второй массив: ");
        for (int temp : array2) {
            System.out.print(temp + "\t");
        }
    }
}