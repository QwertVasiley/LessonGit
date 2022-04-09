package Temp;

import java.util.*;

public class Temp {
    public static void main(String[] args) {
        Queue collection = new PriorityQueue();
        collection.offer(15);
        collection.offer(12);
        collection.offer(7);
        collection.offer(-12);

        System.out.println(" All collection " + collection);
        Iterator iterator = collection.iterator();
        for (int i = 0; i < collection.size(); i++) {
            System.out.println(collection.poll());
        }
        System.out.println(collection);
    }
}



