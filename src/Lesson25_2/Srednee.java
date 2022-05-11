package Lesson25_2;

public class Srednee extends Thread{
    int [] array;
    public Srednee (int... array){
        this.array = array;
    }

    @Override
    public void run() {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            tmp = tmp+array[i];
        }
        System.out.println("Среднее арифметическое " + tmp/array.length);
    }
}
