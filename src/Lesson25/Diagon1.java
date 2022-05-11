package Lesson25;

public class Diagon1 extends Thread{
    private int [] [] array;

    public Diagon1 (int [] [] array){
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
                    System.out.println(array[i][i]);
            }
    }
}
