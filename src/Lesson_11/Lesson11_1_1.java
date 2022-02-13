package Lesson_11;

public class Lesson11_1_1 {
    public static void main(String[] args) {
        //Найти сумму максимальных чисел массива
        //найти разницу минимальных чисел массива
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2};
        int tmp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int output : array) {
            System.out.print(" " + output);
        }
        System.out.println();
        System.out.println("Min " + (array[0] - array[1]));
        System.out.println("Max " + (array[array.length - 1] + array[array.length - 2]));
    }
}
