package Mnogopotok3;

public class NoChet extends Thread{

    @Override
    public void run() {
        try {
            sleep(500);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 1; i <100 ; i+=2) {
            System.out.println(i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
