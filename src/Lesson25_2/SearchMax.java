package Lesson25_2;

public class SearchMax extends Thread {
     int[] array;

    public SearchMax(int[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] > tmp) {
                tmp = array[i];
            }

        }
        System.out.println("Максимальное число массива - " + tmp);
    }
}

