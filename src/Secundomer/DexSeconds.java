package Secundomer;

public class DexSeconds extends Thread {
    private int dexsecs = 0;

    public int getDexsecs(){
        return dexsecs;
    }

    @Override
    public void run() {
        while (true) {
            for (int i = 1; i <= 100; i++) {
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                dexsecs = i;
            }
        }
    }
}
