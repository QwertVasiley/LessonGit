package Mnogopotok2;

public class NumMax extends Thread {
    int[] num;

    public NumMax(int... num) {
        this.num = num;
    }

    public void run() {
        int tmp = num[0];
        for (int i = 1; i < num.length; i++) {

            if (num[i] > tmp) {
                tmp = num[i];
            }

        }
        System.out.println(tmp);
    }

}


