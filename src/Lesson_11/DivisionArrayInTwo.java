package Lesson_11;

import java.util.Arrays;

public class DivisionArrayInTwo {
    public static void main(String[] args) {
        //Разделить массив пополам на два массива
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2};
        int[] array1 = new int[array.length / 2];
        int[] array2 = new int[array.length / 2];
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2) {
                array1[i] = array[i];
            }else{
                array2 [i-array.length/2]= array[i];
            }
        }
        System.out.println("Массив1: " + Arrays.toString(array1));
        System.out.println("Массив1: " + Arrays.toString(array2));
    }
}
