package Homework20;

import java.util.Objects;

public class Shop {
    private int id;
    private String name;

    public Shop(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Shop{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
