package Salad;

public class Tomato extends Vegetable{
    public static final double TOMATO_COEFFICIENT = 0.25;

    public Tomato(double weight) {
        super(weight);
    }

    @Override
    public double getKkalAmount() {
        return getWeight() * TOMATO_COEFFICIENT;
    }
}
