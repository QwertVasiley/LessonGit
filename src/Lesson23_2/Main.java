package Lesson23_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Введите возраст: ");
        int age = scanner.nextInt();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введите Фамилию: ");
        String lastName = scanner1.nextLine();
        System.out.println("Введите адресс: ");
        Scanner scanner2 = new Scanner(System.in);
        String adress = scanner2.nextLine();

        Reader reader = new Reader(name, age, lastName, adress);
        System.out.println(reader);

        ArrayList<Map<Book, Reader>> newList = new ArrayList<>();
        Book book = new Book("Holod", "Turgenev");
        Book book1 = new Book("Nakazanie", "Dostoevskiy");
        Book book2 = new Book("Voina i mir", "Tolsytoy");

        ArrayList<Book> list = new ArrayList<>();
        list.add(book);
        list.add(book1);
        list.add(book2);

        Library library = new Library();

        while (true){
            System.out.println("Введите 1, если хочешь получить книгу");
            System.out.println("Введите 2, если хочешь вернуть книгу");
            System.out.println("Введите 0, если хочешь выйти из программы");

            Scanner scanner3 = new Scanner(System.in);
            int operation = scanner.nextInt();
            switch (operation){
                case 0:
                    System.exit(1);
                    break;
                case 1:
                    System.out.println("Доступны книги");
                    System.out.println(list);
                    int bookNumber = scanner.nextInt();
                    Map<Book,Reader> map = new HashMap<>();
//                    Book book = (Book) list.get(bookNumber+1).keySet();
//                    Reader reader = list.get(bookNumber+1).get(book);
////                    arrayList = library.returnBook(book, reader);
//                    System.out.println();

            }
        }
    }
}
