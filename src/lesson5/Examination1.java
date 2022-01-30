package lesson5;

import java.util.Scanner;

public class Examination1 {
    public static void main(String[] args) {
        //Реализуйте калькулятор с возможностью
        // постоянного ввода числа («Хотите продолжить?»)
        Scanner scanner = new Scanner(System.in);
        boolean yesNo = true;
        do {
            System.out.println("Input first number: ");
            int first = scanner.nextInt();
            System.out.println("Input second number: ");
            int second = scanner.nextInt();
            System.out.println("Input operatoin: ");
            char operation = scanner.next().charAt(0);
            int result = 0;
            switch (operation) {
                case '+':
                    result = first + second;
                    break;
                case '-':
                    result = first - second;
                    break;
                case '*':
                    result = first * second;
                    break;
                case '/':
                    //division by 0
                    result = first / second;
                    break;
                default:
            }
            System.out.println("Result: " + result);
            System.out.println("Input yes or no to repeat");
            String prover = scanner.next();
            if (prover.equals("yes") )
                yesNo = true;
            if (prover.equals("no") )
                yesNo = false;
            //while (yesNo)
            }while (yesNo==true);
        }
    }

