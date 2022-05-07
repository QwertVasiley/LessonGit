package Less24_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //ввод пароля
        //проверить исключения на русские буквы
        //длинна пароля от 6 до 20 цифр
        //ограничить кол-во запросов на ввод пароля

        User user = new User();
        String login, passord;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter login");
        login = scanner.nextLine();
        System.out.println("Enter pass");
        passord = scanner.nextLine();

    }
}
