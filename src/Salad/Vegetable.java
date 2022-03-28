package Salad;

public abstract class Vegetable {
    private final double weight;

    Vegetable(double weight) {
        this.weight = weight;
    }

    public abstract double getKkalAmount();

    public double getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "{" + getClass().getSimpleName() +
                ": weight=" + weight +
                '}';
    }
}
