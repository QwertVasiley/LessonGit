package GameZmeyka2;

public class SecMeter extends Thread{
    private int dexSec = 0; //милисекунды
    private int sec = 0; //секунды
    private int min = 0;//мнуты

    @Override
    public void run() {
        for (dexSec = 0; dexSec < 100; dexSec++) {
            try {
                sleep(10);
                System.out.println("Min-" + min + " Sec-"+ sec + " DexSec-" + dexSec);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (dexSec == 99) {
                dexSec=-1;
                sec++;
            }
            if (sec == 60){
                sec = 0;
                min++;
            }
            if (min == 60) {
                System.out.println("End of time");
                return;
            }
        }
    }
}
