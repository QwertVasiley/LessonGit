package Temp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;


public class AboutLinkedList {
    public static void main(String[] args) {
        // LinkedList(): создает пустой список;
        // LinkedList(Collection<? extends E> collection): создает список, в который добавляет все элементы коллекции collection.
        LinkedList<String> linList = new LinkedList<String>();

        linList.add("Sveta");
        linList.add("Nadya");
        linList.add("Lena");
        linList.add("Mila");
        linList.add("Katty");
        System.out.println("Созданный список: " + linList);
        linList.addFirst("Klava"); //добавление в начало списка
        System.out.println("Добавил а начало: " + linList);
        linList.add(3, "Olga"); //Вставил элемент по индексу
        System.out.println("Вставил 3 элемент: " + linList);
        linList.addLast("Marina"); // Доваил в конец списка
        System.out.println("Добавил в конец:  " + linList);
        linList.set(2, "Yana"); // заменил элемент
        System.out.println("Заменил 2-й элемент: " + linList);
        linList.removeFirst(); // удаление первого элемента
        linList.removeLast();  // удаление последнего элемента
        System.out.println("Удалил 1-й и последний: " + linList);
        linList.remove(2);  //Удаление элемента по индексу
        linList.remove("Mila"); //Удаление элемента по содержимому
        System.out.println("Удалил 2-й элемент и 'Mila' " + linList);


        List<String> rrr = new ArrayList<>();
        rrr = Arrays.asList("Sveta", "Nadya", "Lena", "Mila", "Katty"); // заполнил List
        LinkedList<String> linList2 = new LinkedList<String>();
        for (int i = 0; i < rrr.size(); i++) {  //перегоняю из листа в LinkedList
            linList2.add(rrr.get(i));
        }
        System.out.println("Пернгнал List в LinkedList:  " + linList2);
        linList2.addFirst("Malvina");
        System.out.println("Добавил первый элемент: " + linList2);
    }
}

