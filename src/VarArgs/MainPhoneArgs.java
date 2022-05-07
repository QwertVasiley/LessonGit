package VarArgs;

public class MainPhoneArgs {
    public static void main(String[] args) {
        Phone phone = new Phone(358764,"Apple");

       System.out.println(phone.number+ " "+  phone.model);

        phone.sendMessage(phone.number,"Go to the street!!!");

        phone.sendMessage(378546,"Привет обонент!!!", "Пойдем гулять!!!"); //бесконечно много аргументов String принимает
    }
}
