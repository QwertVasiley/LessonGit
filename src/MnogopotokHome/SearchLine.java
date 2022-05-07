package MnogopotokHome;

public class SearchLine extends Thread {
    String[] array;


    @Override
    public void run() {
        int len = array[0].length();
        int tmp;
        for (int i = 1; i < array.length; i++) {
            tmp = array[i].length();
            if (tmp > len) {
                len = tmp;
            }
        }
        System.out.println("Длина большей строки - " + len);
    }
}





