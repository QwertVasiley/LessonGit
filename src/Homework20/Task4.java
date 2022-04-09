package Homework20;

import java.util.TreeSet;

public class Task4 {
    public static void main(String[] args) {
        // Есть TreeSet имен, необходимо выбрать все от "H" до "W”
        // (есть 2 способа: 1 – через использование 1 метода, а 2 – просто перебирая. Выбирайте по душе )
        TreeSet <String> name = new TreeSet<>();
        name.add("Lizaveta");
        name.add("Vovan");
        name.add("Slavik");
        name.add("Kirill");
        name.add("Duo");
        name.add("Alesya");

        System.out.println(name.subSet("H","W"));

    }
}
