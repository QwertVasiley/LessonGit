package Exam2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Exam2 {
    public static void main(String[] args) {

// 1)	Реализовать следующую программу:
// Пользователю предоставляется возможность на выбор заполнить целочисленный массив или массив слов
// Если выбран массив чисел, то есть 2 варианта заполнения:
// а) самостоятельно, б) рандомными числами
//  Выполнить над массивом следующие действия:
//•	Поиск максимального (минимального (можете 2 реализовать если успеете)) элемента
//•	Вернуть первый индекс введенного им элемента, иначе -1
//•	Сортировка
//  Если был выбран массив слов, то
//•	Отсортировать массив слов по алфавиту (лексикографически)
//•	Пользователю предоставляется возможность ввести букву.
//  Вместо этой буквы теперь будет рандомное число (String.valueOf(randomNumber))

        Scanner scanner = new Scanner(System.in);
        int chooseArray = arraySelection(scanner);
        if (chooseArray == 1) {
            int randCons = chooseRandCons(scanner);
//your if statements have duplicated code. 
//create array before it: int[] array=new int[0]
            if (randCons == 2) {
//array=new int.....
                System.out.println("Enter length array: ");
                int[] array = new int[intsize(scanner)];
                int[] intArray = intArray(scanner, array);
                System.out.println("Origin Array: " + Arrays.toString(intArray));
                outputMaxMin(intArray);
                searchIndex(intArray, scanner); //number whose index you want to find
                sortNumArray(intArray);
                System.out.println("Sort Array: " + Arrays.toString(intArray));
            }
            if (randCons == 1) {
//array=new int.....
                System.out.println("Enter length array: ");
                int[] arrayRnd = new int[intsize(scanner)];
                intArrayRandom(arrayRnd);
                System.out.println("Origin Array Random: " + Arrays.toString(arrayRnd));
                outputMaxMin(arrayRnd);
                searchIndex(arrayRnd, scanner); //number whose index you want to find
                sortNumArray(arrayRnd);
                System.out.println("Sort Array: " + Arrays.toString(arrayRnd));

            }
//and here you can call your methods: 
        }
        if (chooseArray == 2) {
            System.out.println("Enter length array: ");
            String[] arrayTxt = new String[intsize(scanner)];
            intArrayTxt(scanner, arrayTxt);
            System.out.println("Origin Array" + Arrays.toString(arrayTxt));
            sotrArray(arrayTxt);
            replaseLetter(arrayTxt, scanner);
            System.out.println("Modified array: " + Arrays.toString(arrayTxt));
        }
    }

//choseArrayTypeIndex
    static int arraySelection(Scanner scanner) { //выбор массива текстового или числового
        System.out.println("Choose array to work with: \n 1 - numbers \n 2 - strings ");
        int number = scanner.nextInt();
        return number;
    }

    static int chooseRandCons(Scanner scanner) { //выбор способа заполнения массива
        System.out.println("How do you want to initialize array? \n 1 - Randome \n 2 - Console");
        int choose = scanner.nextInt();
        return choose;
    }
//initSize
    static int intsize(Scanner scanner) { //размер массива
        int size = scanner.nextInt();
        if (size < 0) {
            System.out.println("Enter again: ");
            size = intsize(scanner);
        }
        return size;
    }
//initNumArray
    static int[] intArray(Scanner scanner, int[] array) { //заполнение массива с консоли
        System.out.println("Enter values for the array: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    static String[] intArrayTxt(Scanner scanner, String[] array) {
        System.out.println("Enter words for array: ");
//why do you create scanner if you already 
//have it in parameters???
        Scanner scanner1 = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner1.nextLine();//scanner.nextLine()
        }
        return array;
    }
//findMax, findMin, sort - 3 different methods!!!!!
    static void outputMaxMin(int[] array) { //сортировка пузырьком вывод макс и мин числа
        int[] arrayTmp = new int[array.length];
//you already have method for sorting. Do not duplicate!
        for (int i = 0; i < array.length; i++) {
            arrayTmp[i] = array[i];
        }
        int tmp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arrayTmp[j] > arrayTmp[j + 1]) {
                    tmp = arrayTmp[j];
                    arrayTmp[j] = arrayTmp[j + 1];
                    arrayTmp[j + 1] = tmp;
                }
            }
        }
//place it in another method!
        System.out.println("Max " + (arrayTmp[array.length - 1]));
        System.out.println("Min " + (arrayTmp[0]));
    }

    static void searchIndex(int[] array, Scanner scanner) {
        System.out.println("Enter number whose index you want to find:");
        int number = scanner.nextInt();
        for (int i = 0; i < array.length; ++i) {
            if (array[i] == number) {
//return index from method, do not print it here
                System.out.println("Index: " + i);
                return;
            }
            if (array.length - 1 == i)
//return -1, print in another place
                System.out.println("-1");
        }
    }

    static int[] sortNumArray(int[] array) {
        int tmp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }
//initArrayRandom
    static int[] intArrayRandom(int[] array) { //создаем и заполняем массив рандомными числами
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            int rndNum = random.nextInt();
            array[i] = rndNum;
        }
        return array;
    }
//just sort it here, print in another method
    static void sotrArray(String[] array) { //сортировка массива слов
        System.out.print("Sort array: ");
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + "  ");
        }
        System.out.println();
    }

    static String[] replaseLetter(String[] array, Scanner scanner) { //меняю введенный символ на рандомное число
        System.out.println("Enter letter you want to replase: ");
//you have already passed Scanner, no need to create another one!!
        Scanner scanner2 = new Scanner(System.in);
        String letter = scanner2.nextLine();
        Random random = new Random();
        int newRandom = random.nextInt();
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].replace(letter, String.valueOf(newRandom));
        }
        return array;
    }
}
