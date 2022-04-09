package Lesson21;

public class Car {
    private int maxSpeed;
    private int weigth; //вес
    private String model;

    public Car(int maxSpeed, int weigth, String model) {
        this.maxSpeed = maxSpeed;
        this.weigth = weigth;
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", weigth=" + weigth +
                ", model='" + model + '\'' +
                '}';
    }
}
