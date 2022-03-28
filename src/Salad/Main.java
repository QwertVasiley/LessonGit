package Salad;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Salad salad = new Salad(10);
        salad.addVegetable(new Tomato(20));
        salad.addVegetable(new Cucumber(1.1));
        System.out.println(Arrays.toString(salad.findVegByKkal(0.01, 10)));
        System.out.println(salad.getWeight());
        System.out.println(Arrays.toString(salad.getVegetables()));
    }
}

