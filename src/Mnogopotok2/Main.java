package Mnogopotok2;

public class Main {
    //2 потока идин ищет макчимальное значегие в массиве другой минимальное
    public static void main(String[] args) {
        NumMax numMax = new NumMax(12,3,7,150,800,-9,16);
        NumMin numMin = new NumMin(50,84,7885,-5,9,150,-7);


        numMin.start(); //ищет минимальное число
        numMax.start(); //ищет максимальное число

    }
}
