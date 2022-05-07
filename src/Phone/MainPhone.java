package Phone;

public class MainPhone {
    public static void main(String[] args) {
        Phone myPhone = new Phone();
        Phone myPhone1 = new Phone();
        myPhone.model = "Samsung";
        myPhone.number = 375294865;
        myPhone.weight = "ADX-055";

        myPhone1.model = "Nokia";
        myPhone1.number = 56894213;
        myPhone1.weight = "3210";

        System.out.println(myPhone.model);
        System.out.println(myPhone.getNumber());
        System.out.println(myPhone.weight);
        System.out.println();
        System.out.println(myPhone1.model);
        System.out.println(myPhone1.getNumber());
        System.out.println(myPhone1.weight);

        System.out.println(myPhone);
        System.out.println(myPhone1);

        myPhone.receiveCall("Мама "+ "по номеру " +myPhone.number);
        myPhone1.receiveCall("Папа "+ "по телефону модели "+ myPhone1.getModel());
    }
}
