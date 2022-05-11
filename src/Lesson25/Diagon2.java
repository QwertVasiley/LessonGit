package Lesson25;

public class Diagon2 extends Thread{
    private int [] [] array;

    public Diagon2(int [] [] array){
        this.array = array;
    }

    @Override
    public void run() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][array.length - i - 1]);
            }
        }
    }


