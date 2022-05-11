package Lesson25_HomeCollection;

import java.util.*;


public class Main {
    public static void main(String[] args) {
        //создать коллекцию
        //в два потока найти второй по величине элемент коллекции
        // и второй по меньшеству элемент коллекции

        List<Integer> numbers = new ArrayList<Integer>();
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

        System.out.println("Все значения коллекции" + numbers);

        SecondMax secondMax = new SecondMax(numbers);
        SecondMin secondMin = new SecondMin(numbers);
        secondMax.start();
        secondMin.start();

//        Collections.sort(numbers);
//        System.out.println("сортированая коллекция " + numbers);

    }
}
