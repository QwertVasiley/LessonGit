package Temp3;

import java.util.*;

public class AboutSortedSet {
    public static void main(String[] args) {
        SortedSet<String> sort = new TreeSet<>();

        sort.add("Miha");
        sort.add("Dimon");
        sort.add("Olga");
        sort.add("Timoha");
        sort.add("Vova");
        sort.add("Nikita");
        System.out.println("Созданный список: " + sort);

        Iterator iterator = sort.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString() + " ");
        }
    }
}