package Lesson12_HomeWork;

import java.util.Arrays;

public class OneArrayByTwoArray {
    public static void main(String[] args) {
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2, 5};


        if (array.length % 2 == 0) {
            int[] array1 = new int[array.length / 2];
            int[] array2 = new int[array.length / 2];
            for (int i = 0; i < array.length; i++) {
                if (i < array.length / 2) {
                    array1[i] = array[i];
                }
                if (i >= array.length / 2)
                    array2[i - array.length / 2] = array[i];
            }
            System.out.println("Массив1: " + Arrays.toString(array1));
            System.out.println("Массив1: " + Arrays.toString(array2));
        }
        if (array.length % 2 != 0) {
            int[] array1 = new int[array.length / 2 + 1];
            int[] array2 = new int[array.length / 2];
            for (int i = 0; i < array.length; i++) {
                if (i <= array.length / 2) {
                    array1[i] = array[i];
                }
                if (i > array.length / 2)
                    array2[i - array.length / 2 - 1] = array[i];
            }
            System.out.println("Массив1: " + Arrays.toString(array1));
            System.out.println("Массив1: " + Arrays.toString(array2));
        }
    }
}
