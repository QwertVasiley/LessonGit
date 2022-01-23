package lesson5;

public class Lesson5_6 {
    public static void main(String[] args) {

        // Вычислить: 1+2+4+8+...+256

        int b=1;
        int sum = 1;
        while (b < 256) {

            b = b+b; //создаёт ряд чисел нужных для сложения
            sum=sum+b;

        }
        System.out.println(sum);
    }
}
