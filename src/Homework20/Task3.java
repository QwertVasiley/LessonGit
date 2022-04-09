package Homework20;

import java.util.HashSet;
import java.util.Set;

public class Task3 {
    // Есть HashSet магазинов. У магазина есть название и ID.
    // Создать несколько магазинов (через оператор new Shop(..))
    // с одинаковым ID и названием и добавить их в ваш Set.
    public static void main(String[] args) {
        Set<Shop> shops = new HashSet<>();
        shops.add(new Shop(15, "Evroopt"));
        shops.add(new Shop(15, "Evroopt"));
        shops.add(new Shop(20, "Korona"));
        shops.add(new Shop(14, "ProStore"));
        System.out.println(shops);
    }
}
