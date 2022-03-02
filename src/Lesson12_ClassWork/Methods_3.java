package Lesson12_ClassWork;

public class Methods_3 {
    public static void main(String[] args) {
        sum(1, 2, 3, 5, 6, 7, 8, 21, 24, 5, 666, 5);
        //sum();
        sumStr("text", 1, 4);
    }

    static void sum(int... nums) {  //находит сумму всех чисел массива
        int result = 0;
        for (int n : nums) {
            result += n;
        }
        System.out.println(result);
    }

    static void sumStr(String message, int... nums) { //выводим текст и ссумируем заданные числа

        System.out.println(message);
        int result = 0;
        for (int x : nums) {
            result += x;
        }
        System.out.println(result);
    }
}

