package Lesson21;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
       Car audi  = new Car( 230, 2000, "A4");
       Car toyota = new Car(200, 2011, "RAv 4");
       Car mers = new Car( 250, 3000, "CLS");

        Map<Integer, Car> carMap = new HashMap<>();
        carMap.put(1,audi);
        carMap.put(2, toyota);
        carMap.put(3,mers);

        System.out.println(carMap);
    }
}
