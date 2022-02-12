package Lesson_10;

public class MaxMin {
    public static void main(String[] args) {
        //найти максимальное число
        //найти минимальное число
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2};
        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}