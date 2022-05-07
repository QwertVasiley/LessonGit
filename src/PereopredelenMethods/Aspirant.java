package PereopredelenMethods;

public class Aspirant extends Student {


    public Aspirant(String name, String groupe, double avgMark) {
        super(name, groupe,avgMark);

    }

    @Override
    public double getSchoalship() {

        return avgMark == 5 ? 200 : 180;
    }
}
