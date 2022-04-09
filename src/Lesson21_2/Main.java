package Lesson21_2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    //Создать класс «Сотрудник» в нем проинициализировать поля фамилия и отдел.
    // Пометисть это все в мапу
    public static void main(String[] args) {

        Map<String, Integer> employee = new HashMap<>();
        employee.put("Petrov", 15);
        employee.put("Sidorov", 8);
        employee.put("Veselkin", 43);

        System.out.println(employee);
    }
}
