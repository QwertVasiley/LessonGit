package lesson5;

import java.util.Scanner;

public class Examination {
    public static void main(String[] args) {
                //	Посчитать сумму четных, нечетных и всех чисел
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int chet = 0;
        int sumChet = 0;
        int noChet;
        int sumNoChet = 0;
        int number = scanner.nextInt();
        //What did I say at the previous lesson? We could do it in 1 loop!
        while (chet<number) {
            chet=chet+2;
            sumChet = sumChet + chet;
        }
            for (noChet = 1; noChet<=number; noChet =noChet+2){
                sumNoChet=sumNoChet+noChet;
        }
        System.out.println("Sum of even numbers: "+sumChet);
        System.out.println("Sum of odd numbers: "+sumNoChet );
        System.out.println("Total amount: "+(sumChet+sumNoChet));

        }
    }

