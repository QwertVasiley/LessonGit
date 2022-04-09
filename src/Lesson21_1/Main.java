package Lesson21_1;

import java.util.HashMap;
import java.util.Map;

public class Main {
    // загоняем в мапу четные числа до 100
    // все числа складываем и выводим
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <= 50; i++) {
            int j = i * 2;
            map.put(i, j);
        }
        int result = 0;
        for (int i = 0; i < map.size(); i++) {
            result = result + map.get(i);
        }
        System.out.println("Сумма = " + result);
    }
}
