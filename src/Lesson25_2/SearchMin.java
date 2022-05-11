package Lesson25_2;

public class SearchMin extends Thread {
     int[] array;

    public SearchMin(int... array) {
        this.array = array;
    }

    @Override
    public void run() {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {

            if (array[i] < tmp) {
                tmp = array[i];
            }
        }
        System.out.println("Минимальное число массива - " + tmp);
    }
}

