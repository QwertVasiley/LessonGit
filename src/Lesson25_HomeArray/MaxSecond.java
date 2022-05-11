package Lesson25_HomeArray;

public class MaxSecond extends Thread {
    private int[] array;

    public MaxSecond(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = array.length - 1; i > 0; i--) { // сортировка пузырьком
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        System.out.println("Второй по величине элемент массива " + array[array.length - 2]); //вывод предпоследнего значения массива
    }
}
