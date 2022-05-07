package Lesson23;

public class Main {
    public static void main(String[] args) {
       //создать класс Phone
        //сделать 3 экземпляра
        // переопределить toString
        Phone phone = new Phone(37529, 2424222, "lkjkjsdf");
        Phone phone1 = new Phone(37529324, 4243222, "Hp");
        Phone phone2 = new Phone(37234529, 276222, "LG");
        //System.out.println(phone.receiveCall1(phone1));
        System.out.println(phone2.senMess(phone));
    }
}
