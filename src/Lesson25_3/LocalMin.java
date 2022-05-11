package Lesson25_3;

public class LocalMin extends Thread{
    private int [] array;

    public LocalMin (int... array){
        this.array = array;
    }

    @Override
    public void run() {

        for (int i = 1; i < array.length-1; i++) {
            if (array[i-1]>array[i] && array[i+1] > array[i]){
                System.out.println("Локальный минимум " + array[i]);
            }
        }
    }
}

