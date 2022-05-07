package Konstruktor;

public class Phone {
    int number;
    String model;
    String weight;

    Phone(){}

    Phone(int n, String m, String w) {
        number = n;
        model = m;
        weight = w;
    }
        Phone (int num, String mod){
        number = num;
        model = mod;
    }

    public int getNumber() {
        return number;
    }

    public String getModel() {
        return model;
    }

    public String getWeight() {
        return weight;
    }
}
