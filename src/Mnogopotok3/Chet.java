package Mnogopotok3;

public class Chet extends Thread{


    @Override
    public void run() {

        for (int i = 0; i < 100; i+=2) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
