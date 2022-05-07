package Temp3;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class AboutSet {
    public static void main(String[] args) {
        HashSet<String> setList = new HashSet<String>();
        setList.add("Milk");
        setList.add("Bread");
        setList.add("Tea");
        setList.add("Coffee");
        setList.add("Pizza");
        setList.add("Apple");
        setList.add("Milk");
        System.out.println("Хранятся в каком-то сложном(непонятном) порядке: " + setList);
        setList.add("Tea"); // не добавится
        System.out.println("Не позволяет создание дубликатов 'Tea' в списке " + setList);
        // Все методы HashSet аналогичны методам ArrayList за исключением того,
        // что метод add(Object o) добавляет объект в множество только в том случае,
        // если его там нет. Возвращаемое методом значение — true, если объект добавлен,
        // и false, если нет.

        //заполнил рандомными числами от 0 до 10 аж 1000 числами
        Random random = new Random(30);
        Set<Integer> numberSet = new HashSet<>();
        for (int i = 0; i < 1000; i++)
            numberSet.add(random.nextInt(15));
        System.out.println("Рандом упорядочился и ни каких повторов: " + numberSet.toString()); //на выходе всеравно всего 10 разных чисел
        System.out.println();


        TreeSet<String> setTreeSet = new TreeSet<String>();
        setTreeSet.add("Milk");
        setTreeSet.add("Bread");
        setTreeSet.add("Tea");
        setTreeSet.add("Coffee");
        setTreeSet.add("Pizza");
        setTreeSet.add("Apple");
        System.out.println("Отсортировал весь список: " + setTreeSet);

    }
}
