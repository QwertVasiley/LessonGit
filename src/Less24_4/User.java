package Less24_4;

import java.util.Scanner;

public class User {
    private String login;
    private String password;

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void registration (String login, String password){
        Scanner scanner = new Scanner(System.in);
        if (login.length()<=5){
            while (login.length()<=5){
                System.out.println("Pls enter login with more than five symbols");
                login = scanner.next();
            }
        }
        char[] ch;
        boolean ifCorrect = false;
        while (true){
            ch = login.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (ch[i]>='A'&&ch[i]<='Z'||ch[i]>='a'&&ch[i]<='z'){
                    ifCorrect = true;
                }
            }
            if (ifCorrect)
                break;
            System.out.println("Enter correct login");
            login = scanner.next();
        }
        while (!(password.length()>=6)&&!(password.length()<=20)) {
            System.out.println("Enter password with correct length");
            password = scanner.next();
        }
        char[] chPasswor;
        while (true){
            chPasswor = password.toCharArray();
            for (int i = 0; i < chPasswor.length; i++) {
                if (chPasswor[i]>='0'&&chPasswor[i]<='9'){
                    ifCorrect = true;
                }
            }
            if (ifCorrect)
                break;
            System.out.println("Enter correct password");
            password = scanner.next();
        }

        this.login = login;
        this.password = password;

    }
}