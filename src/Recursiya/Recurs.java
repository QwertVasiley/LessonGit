package Recursiya;

public class Recurs {

    public static void main(String[] args) {
        summ(1);
    }

    static void summ(int a) {
        if (a <= 10) {
            System.out.println(a);
            a++;
            summ(a); //вызов из метода этого же метода
        }
    }
}

