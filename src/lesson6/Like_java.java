package lesson6;

import java.util.Scanner;

public class Like_java {
    public static void main(String[] args) {

        //Вам нравится программирование на java?

        String yenoUser = "n";
        String yesNoComp = "y";
        String deistvit = "";
        System.out.print("Тебе нравится программирование на java? y/n? ");
        int i=6;
        Scanner scanner = new Scanner(System.in);

        do {
            yenoUser = scanner.next();
            if (yenoUser.intern() == yesNoComp) {
                System.out.println("Я знал, что тебе это по вкусу!!! Мне тоже нравится Java");
            break;
            }
            if (yenoUser.intern() != yesNoComp && i>2) System.out.println("Ты " +(deistvit)+"уверен, что тебе не нравится программирование на Java? y/n? ");
            i--;
            yesNoComp = "n";
            deistvit = deistvit + "действительно ";
            if (i==1) System.out.println("Это очень плохо, но я уверен, что скоро понравится ;-)");
            }while (i>1);

    }
}
