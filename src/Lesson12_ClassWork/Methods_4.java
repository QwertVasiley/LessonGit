package Lesson12_ClassWork;

public class Methods_4 {
    //работа с разными размерами переменных
    //результат операций возвращаем в первый метод
    public static void main(String[] args) {
        int result = sum(2, 4444, 55);
        int result2 = sum(1, 4, 9);
        int finalResult = result + result2;
        System.out.println(finalResult);
    }

    static int sum(int a, int b, int c) {
        byte sum = (byte) (a + b + c);
        return sum;
    }
}

