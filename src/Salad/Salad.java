package Salad;

import java.util.Arrays;

public class Salad {
    private Vegetable[] vegetables;
    private int vegCounter;

    public Salad(int amountOfVegetables) {
        vegetables = new Vegetable[amountOfVegetables];
        vegCounter = 0;
    }

    public void addVegetable(Vegetable vegetable) {
        vegetables[vegCounter++] = vegetable;
    }

    public Vegetable[] findVegByKkal(double minKkal, double maxKkal) {
        Vegetable[] foundVegetables = new Vegetable[vegCounter];
        int foundCounter = 0;
        for (int i = 0; i < vegCounter; i++) {
            Vegetable vegetable = vegetables[i];
            double kkalAmount = vegetable.getKkalAmount();
            if (kkalAmount >= minKkal && kkalAmount <= maxKkal) {
                foundVegetables[foundCounter++] = vegetable;
            }
        }
        return removeNullVegetables(foundVegetables);
    }

    private Vegetable[] removeNullVegetables(Vegetable[] vegetables) {
        Vegetable[] refinedArray = new Vegetable[vegetables.length];
        int count = 0;
        for (Vegetable vegetable : vegetables) {
            if (vegetable != null) {
                refinedArray[count++] = vegetable;
            }
        }
        return Arrays.copyOf(refinedArray, count);
    }

    public double getWeight() {
        double totalWeight = 0;
        for (int i = 0; i < vegCounter; i++) {
            totalWeight += vegetables[i].getWeight();
        }
        return totalWeight;
    }

    public Vegetable[] getVegetables() {
        return removeNullVegetables(vegetables);
    }
}

