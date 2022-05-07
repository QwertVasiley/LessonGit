package Lesson22_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //создать класс персон с именем и возрастом.
    // занести их в мап где ключом будет имя.
    // при вводе с клавиатуры
    // двух числел - выводит имена персонов возраст которых попадает в данный диапазон
    public static void main(String[] args) {
        Person vova = new Person("Vova", 25);
        Person dimon = new Person("Dimon", 15);
        Person dina = new Person("Dina", 30);
        Person kola = new Person("Kolya", 21);


        Map<String, Integer> people = new HashMap<>();
        people.put(vova.getName(), vova.getAge());
        people.put(dimon.getName(), dimon.getAge());
        people.put(dina.getName(), dina.getAge());
        people.put(kola.getName(), kola.getAge());

        System.out.println("All people " + people);

        System.out.println("Enter range, first num: ");
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        System.out.println("Enter range, second num: ");
        int secondNum= scanner.nextInt();

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
                if (firstNum < entry.getValue()&&  secondNum > entry.getValue())
            System.out.println(entry.getKey() + " " +  entry.getValue());
            }
        }
    }

