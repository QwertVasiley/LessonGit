package Lesson26;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String [] arSt = new String[] {"Sveta", "Vova", "Dima"};
        Integer [] arInt = new Integer[] {45,40,9};
        Double [] arDou = new Double[] {5.6, 7.9, 0.7};



        Arr<String> arrStr = new Arr<String>(arSt);
        Arr<Integer> arrInt = new Arr<Integer>(arInt);
        Arr<Double> arrDoub = new Arr<Double>(arDou);

        System.out.println(arrStr.toString());
        System.out.println(Arrays.toString(arDou));
        System.out.println(arInt.toString());
    }
}
