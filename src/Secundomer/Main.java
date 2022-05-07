package Secundomer;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        DexSeconds dexSeconds = new DexSeconds();
        Seconds seconds = new Seconds();
        Minutes minutes = new Minutes();
        Hours hours = new Hours();

        dexSeconds.start();
        seconds.start();
        minutes.start();
        hours.start();

        while (true){
            Thread.sleep(10);
            System.out.println("Hour-" + hours.getHours() + " Min-" + minutes.getMinutes()+ " Sec-" + seconds.getSeconds()+ " dex-" + dexSeconds.getDexsecs());
        }

    }
}
