package lesson4_2;

public class Lesson4_2 {
    public static void main(String[] args) {


        for (int a = 5, b = 6, c=a; b > 0; c=c+a, b--) {
            System.out.println(c);
        }
    }
}