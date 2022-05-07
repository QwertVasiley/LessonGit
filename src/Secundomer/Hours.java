package Secundomer;

public class Hours extends Thread {
    private int hours;

    public int getHours() {
        return hours;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 0; i <= 10000; i++) {
                try {
                    sleep(3600000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                hours = i;
            }
        }
    }
}
