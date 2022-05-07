package GetterSetterPhone;

public class MainPhone {
    public static void main(String[] args) {
        Phone phone1 = new Phone(375298678, "Volodya", "Nokia");
        Phone phone2 = new Phone(987513351, "Kolya", "Samsung");
        Phone phone3 = new Phone(753614822, "Ann", "Sony");
        Phone phone4 = new Phone(851335564, "Sveta", "Apple");

        System.out.println(phone1 + "\n" + phone2 + "\n" + phone3 + "\n" + phone4+"\n");

        phone1.setName("Miha");  //меняю некоторые значения при помощи setter
        phone2.setNumber(6666666);
        phone3.setModel("PATRIOT");
        phone4.setName("Ved`ma");

        System.out.println(phone1 + "\n" + phone2 + "\n" + phone3 + "\n" + phone4+ "\n");

        System.out.println(phone1.getNumber());  //возвращаю значения при помощи getter
        System.out.println(phone2.getModel());
        System.out.println(phone3.getName());

    }
}
