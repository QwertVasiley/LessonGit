package Lesson21_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    //Создать класс «Сотрудник» в нем проинициализировать поля фамилия и отдел.
    // Пометисть это все в мапу
    public static void main(String[] args) {

        Employee petrov = new Employee("Petrov", 15);
        Employee sidorov = new Employee("Sidorov", 8);
        Employee veselkin = new Employee("Veselkin", 43);

        Map<String, Integer> employ = new HashMap<>();
        employ.put(petrov.getLastName(), petrov.getDepartment());
        employ.put(sidorov.getLastName(), sidorov.getDepartment());
        employ.put(veselkin.getLastName(), veselkin.getDepartment());

        System.out.println(employ);
    }
}
