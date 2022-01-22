package lesson4;

public class Lesson4 {
    public static void main(String[] args) {
//) Одноклеточная амеба каждые 3 часа делится на 2 клетки.
// Определить, сколько амеб будет через 3, 6, 9, 12,..., 24 часа.
        // i - время
        // y=1 - амёбы
        for (int i=3, y=2 ; i<=24; i+=3, y=y*2) {
            System.out.println("Кол-во: " +y);
        }
    }

}
