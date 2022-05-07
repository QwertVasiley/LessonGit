package Konstruktor;

public class MainKonstrukPhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone(375287465,"Nokia", "3210BD");
        Phone myPhone1 = new Phone(9450456, "Samsung");
        Phone myPhone2 = new Phone();

        System.out.println(myPhone.getNumber());
        System.out.println(myPhone.getModel());
        System.out.println(myPhone.getWeight());
        System.out.println();
        System.out.println(myPhone1.getNumber());
        System.out.println(myPhone1.getModel());
        System.out.println(myPhone1.getWeight());
        System.out.println();
        System.out.println(myPhone2.getNumber());
        System.out.println(myPhone2.getModel());
        System.out.println(myPhone2.getWeight());

    }
}
