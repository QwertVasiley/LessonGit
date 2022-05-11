package Lesson25_2;

import java.util.Random;

public class Main {
    //Написать программу которая заполняет массив 100 000 рандомными числами
    // от 0 до 100 найти максимальный и минимальный элементы массива с помощью двух разных потоков
    public static void main(String[] args) {

            Random random = new Random();

            int[] array = new int[100000];
            for (int i = 0; i < array.length; i++) {
                array[i] = random.nextInt(100);
                System.out.print(array[i] + " ");
            }
        System.out.println();
        SearchMax searchMax = new SearchMax(array);
        SearchMin searchMin = new SearchMin(array);
        Srednee srednee = new Srednee(array);


        searchMax.start();
        searchMin.start();
        srednee.start();
        }

    }

