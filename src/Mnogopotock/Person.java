package Mnogopotock;

public class Person extends Thread{

    String[] strs;
    public Person (String... strs){
        this.strs = strs;
    }

    @Override
    public void run() {
        for (int i = 0; i < strs.length; i++) {
            System.out.println("Hello people " + strs[i]);
            try {
                sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
