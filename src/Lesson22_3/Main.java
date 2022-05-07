package Lesson22_3;

import java.util.ArrayList;
import java.util.List;


public class Main {
    // Сделать из лист сэт(удалит все повторяющиеся значения)
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(15);
        numbers.add(12);
        numbers.add(40);
        numbers.add(3);
        numbers.add(15);
        numbers.add(5);
        numbers.add(1);
        numbers.add(3);
        numbers.add(15);
        numbers.add(6);
        numbers.add(1);
        numbers.add(9);
        numbers.add(2);
        numbers.add(14);

        System.out.println(numbers);
        // numbers.remove(0); //удалит обект с инексом "0"
        // System.out.println(numbers.indexOf(1)); // возвращает индекс соедращий указанное значение
        // System.out.println(numbers.get(2)); //возвращает содержимое индекса

        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i+1; j <numbers.size(); j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    numbers.remove(j);
                }
            }
        }
        System.out.println(numbers);
    }
}


