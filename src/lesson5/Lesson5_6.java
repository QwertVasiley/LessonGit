package lesson5;

public class Lesson5_6 {
    public static void main(String[] args) {

        // Вычислить: 1+2+4+8+...+256
//what is b?? naming!
        int b=1;
        int sum = 1;
        while (b < 256) {
            //b++
            b = b+b; //создаёт ряд чисел нужных для сложения
            //sum+=b
            sum=sum+b;

        }
        System.out.println(sum);
    }
}
