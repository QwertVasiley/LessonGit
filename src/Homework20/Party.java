package Homework20;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Party {
    // Вход на вечеринку только по списку.
    // Есть список имен (коллекция).
    // Пользователь вводит с консоли свое имя,
    // а программа проверяет его наличие в списке,
    // после чего говорит может он пройти или нет
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Lizaveta");
        list.add("Vova");
        list.add("Sanya");
        list.add("Kirill");
        list.add("Duo");
        list.add("Alesya");
        System.out.println("List of invitees: " + list);
        Scanner scanner = new Scanner(System.in);
        String namePerson = (nameForInput(scanner));
        listcomparison(namePerson, (ArrayList) list);
    }

    static String nameForInput(Scanner scanner) {
        System.out.println("Your name? ");
        String txt = scanner.nextLine();
        return txt;
    }

    static void listcomparison(String namePerson, ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(namePerson)) {
                System.out.println("Welcome " + namePerson);
                return;
            } else if (i == list.size() - 1) {
                System.out.println("You are not on the list ");
            }
        }
    }
}

