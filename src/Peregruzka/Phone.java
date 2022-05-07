package Peregruzka;

public class Phone {
    long number;
    String name;
    String model;

    public Phone() {
    }

    public Phone(long number, String name) {
        this.number = number;
        this.name = name;
    }

    public Phone(long number) {
        this.number = number;
    }

    public Phone(long number, String name, String model) {
        this.number = number;
        this.name = name;
        this.model = model;
    }

    void receiveCall(String name){
        System.out.println("Вам звонит "+ name);
    }
    void receiveCall (String name, int number){
        System.out.println("Вам звонит " + name + "с номера "+ number);
    }

}
