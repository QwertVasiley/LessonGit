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
        //why do you call method in (...)????
        String namePerson = (nameForInput(scanner));
        listcomparison(namePerson, (ArrayList) list);//no need to write  (ArrayList) list, just pass list! 
    }
//nameForInput->getNames
    static String nameForInput(Scanner scanner) {
        System.out.println("Your name? ");
        String txt = scanner.nextLine();
        return txt;
    }
//listcomparison->showInvited or something like this
    //not ArrayList<String>, but List<String> in parameter
    //list->partyVisitors or something like this
    static void listcomparison(String namePerson, ArrayList list) {
        //actually you don't need to iterate. There is a method contains(...), use it:) : if (list.contains(namePerson)) {....} else{...}
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(namePerson)) {
                System.out.println("Welcome " + namePerson);
                return;
                //I don't understand this statement in if, just else{......}
            } else if (i == list.size() - 1) {
                System.out.println("You are not on the list ");
            }
        }
    }
}

