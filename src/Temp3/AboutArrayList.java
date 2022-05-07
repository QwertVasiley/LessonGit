package Temp3;

import java.util.*;

public class AboutArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(15);
        myList.add(25);
        myList.add(5);
        myList.add(-3);
        myList.add(45);
        myList.add(33);
        myList.add(85);
        myList.add(-15);
        System.out.println(myList); //вывод
        myList.remove(1);     // удаляет элемент по его индексу
        System.out.println("Удален первый элемент: "+ myList);

        System.out.println("вызвал второй элемент " + myList.get(1));   //вызов второго элемента по его индексу
        myList.set(2, 100);  //заменяет элемент по указанному индексу
        System.out.println("заменен элемент " + myList);
        myList.remove(4); // удалил элемент указанного индекса
        System.out.println("удалил элемент  " + myList);
        System.out.println("Находим индекс элемента по содержимому, число 100 имеет индекс - " + myList.indexOf(100));
        System.out.println("Проверка наличия элемента 5 - " + myList.contains(5) + ". Проверка наличия элемента 777 - " + myList.contains(777));

        //конвертируем ArrayList в обычный массив
        Integer [] array = null;
        array = myList.toArray(new Integer[myList.size()]); // конвертация и указание размера массива
        for (int i:array) {  //вывод массива через foreach
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array)); // вывод массива через Arrays.toString

        //Интерфейс List
        List<String> secondlist = new ArrayList<String>(); //
        secondlist.add("Petr");
        secondlist.add("Vanya");
        secondlist.add("Vasil");
        secondlist.add("Nadya");
        secondlist.add("Felix");
        System.out.println("Вывод List " + secondlist);

        List<Integer> numlist = Arrays.asList(1, 2, 5, 9, 11); //Пример создания и инициализации массива из объектов Integer.
        System.out.println(numlist);
        List<String> strList = Arrays.asList("one", "two", "six", "five");
        System.out.println(strList); //Пример создания и инициализации массива из объектов String.
    }
}

