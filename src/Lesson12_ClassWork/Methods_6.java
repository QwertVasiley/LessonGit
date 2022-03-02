package Lesson12_ClassWork;

public class Methods_6 {
    //По указанному часу приветствуем согласно времени суток
    //Если время вышло за рамки допустимого - завершаем программу
    public static void main(String args[]) {
        daytime(14);
    }

    static void daytime(int hour) {
        if (hour > 24 || hour < 0)
            return;
        if (hour > 21 || hour < 6)
            System.out.println("Good night");
        else if (hour >= 15)
            System.out.println("Good evening");
        else if (hour >= 11)
            System.out.println("Good after noon");
        else
            System.out.println("Good morning");
    }
}