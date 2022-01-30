package lesson5;

public class Lesson5_5 {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            if (i == 5 | i==6) //выбросит числа из цикла 5,6
                continue;
            System.out.println(i);
        }
    }
}
