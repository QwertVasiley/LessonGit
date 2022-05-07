package Mnogopotok3;

public class Main {
    //создать многопоточное исполнение вывода четных и не четных чисел от 0 до 100
    // в одном методе выводятся четные, в другом не четные

    public static void main(String[] args) {
        Chet chet = new Chet();
        NoChet noChet = new NoChet();

        chet.start();
        noChet.start();
    }
}
