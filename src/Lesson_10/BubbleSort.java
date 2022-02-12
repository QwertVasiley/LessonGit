package Lesson_10;

public class BubbleSort {
    public static void main(String[] args) {
        //сортировка по возрастанию пузырьком
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2};

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        for (int output : array) {
            System.out.print(" " + output);
        }
    }
}