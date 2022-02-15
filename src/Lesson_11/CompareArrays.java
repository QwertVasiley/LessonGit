package Lesson_11;

import java.util.Arrays;

public class CompareArrays {
    //сравнить массивы на равенсво
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5, 6, 7};
        int[] array2 = {1, 2, 3, 4, 5, 6, 7};
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
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}

