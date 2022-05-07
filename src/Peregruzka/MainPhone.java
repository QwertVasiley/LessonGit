package Peregruzka;

public class MainPhone {
    public static void main(String[] args) {
        Phone phone = new Phone(375297545,"Max");
        Phone phone1 = new Phone(810786351,"Marina", "Nokia");
        Phone phone2 = new Phone(1000000000);

        System.out.println(phone.name);

        System.out.println(phone1.model);

        phone.receiveCall("Mikola");
        phone.receiveCall("Alesya",666666);

        System.out.println();

        phone1.receiveCall("Гопник Саша");
        phone1.receiveCall("Классная девочка Марина", 85645654);
    }
}
