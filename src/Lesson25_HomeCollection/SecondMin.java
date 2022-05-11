package Lesson25_HomeCollection;

import java.util.Collections;
import java.util.List;


public class SecondMin extends Thread {
    private List<Integer> number;

    public SecondMin(List<Integer> number) {
        this.number = number;
    }

    @Override
    public void run() {
        Collections.sort(number);
        System.out.println("Второе минимальное число в коллекции " + number.get(1));
    }
}
