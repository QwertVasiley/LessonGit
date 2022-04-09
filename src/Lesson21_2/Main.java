package Lesson21_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //Создать класс «Сотрудник» в нем проинициализировать поля фамилия и отдел.
    // Пометисть это все в мапу
    // найти сотрудника через сканер
    public static void main(String[] args) {

        Employee petrov = new Employee("Petrov", 15);
        Employee sidorov = new Employee("Sidorov", 8);
        Employee veselkin = new Employee("Veselkin", 43);

        Map<String, Integer> employ = new HashMap<>();
        employ.put(petrov.getLastName(), petrov.getDepartment());
        employ.put(sidorov.getLastName(), sidorov.getDepartment());
        employ.put(veselkin.getLastName(), veselkin.getDepartment());

        System.out.println("All departments " + employ);

        System.out.println("Enter LastName ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        for (Map.Entry entry : employ.entrySet()) {

            if (entry.getKey().equals(name)) {
                System.out.println(name + " " + entry.getValue());
                return;
            }
        }
        System.out.println("No name");
    }
}




