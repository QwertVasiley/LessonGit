package lesson5;

public class Lesson5_9 {
    public static void main(String[] args) {
        //Даны числа от 0 до 100.
        //Посчитать сумму четных и вывести на экран
        //Посчитать сумму нечетных и вывести на экран
        //Найти общую сумму всех чисел


        int c=0; //переменная четных чисел
        int sumChet = 0; //сумма сумм четных чисел
        int i=1; //переменная не четных чисел
        int sumNoChet = 1;

        while (c<25){
//you did a lot of operations. we could find odd and even number in 1 while loop using if-else and '%'
        while (c<100){
            c=c+2;
            sumChet = sumChet+c;
        }

        while (i<24) {
            i=i+2;
            sumNoChet=sumNoChet+i;
        }
        System.out.println("Сумма четных чисел: "+sumChet);
        System.out.println("Сумма не четных чисел: "+sumNoChet );
        System.out.println("Общаяя сумма: "+(sumChet+sumNoChet));
    }
}
