package Lesson_11;

import java.util.Arrays;

public class CopyArray {
    //скопировать один массив в другой
    public static void main(String[] args) {
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2};
        int [] arrayNew;
        arrayNew = array;
        System.out.println(Arrays.toString(arrayNew));
    }
}
