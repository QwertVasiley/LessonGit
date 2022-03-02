package Lesson12_ClassWork;

import java.util.Scanner;

public class Methods_8 {
    //Математические операции над числами
    public static void main(String[] args) {
        double x = 28;
        double y = 4;

        // return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " + Math.max(x, y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));

        //returns 28 power of 4 i.e. 28*28*28*28
        System.out.println("Power of x and y is: " + Math.pow(x, y));

        // return the logarithm of given value
        System.out.println("Logarithm of x is: " + Math.log(x));
        System.out.println("Logarithm of y is: " + Math.log(y));

        // return the logarithm of given value when base is 10
        System.out.println("log10 of x is: " + Math.log10(x));
        System.out.println("log10 of y is: " + Math.log10(y));

        Methods_3 example = new Methods_3();  //Обращение к друним методам вне этого кода, вычислили сумму
        example.sum(1, 2, 3, 4);

        Methods_6.daytime(8); // Нашли время суток

        System.out.println("Int number: ");
        //if method is not static, then create object using 'new':
        //Если метод не static, то создаём объект при помощи "new"
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt();
    }
}