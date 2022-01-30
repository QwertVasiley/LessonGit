package lesson5;

import java.util.Scanner;

public class Lesson5_9_1 {

    //Решить уравнение ax^2+bx+c=0

    public static void main(String[] args) {
        double a, b, c;
        double diskrim;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите a, b и c:");
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        diskrim = b * b - 4 * a * c;  //находиим дискриминант

        if (diskrim > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(diskrim)) / (2 * a);
            x2 = (-b + Math.sqrt(diskrim)) / (2 * a);
            System.out.println("Корни X1= " + x1 + " ,X2= " + x2);
        } else if (diskrim == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение с единственным корнем: X = " + x);
        } else {
            System.out.println("Уравнение не имеет действительных корней");
        }
    }
}


