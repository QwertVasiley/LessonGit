package Lesson25_HomeCollection;


import java.util.Collections;
import java.util.List;

public class SecondMax extends Thread {
    private List<Integer> number;

    public SecondMax (List <Integer> number){
        this.number =  number;
    }


    @Override
    public void run () {
    Collections.sort(number);
       // System.out.println(number);
        System.out.println("Второе максимальное число в коллекции " + number.get(number.size()-2));
    }
}