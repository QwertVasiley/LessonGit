package lesson5;

    //Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
//+
public class Lesson5_8 {
    public static void main(String[] args) {
        int i=1;
        int sum = 1;
        while (i<99) {
            //i+=2, sum+=i
            i=i+2;
            sum = sum+i;

        }
        System.out.println("Итог   : "+sum);
        }
    }
