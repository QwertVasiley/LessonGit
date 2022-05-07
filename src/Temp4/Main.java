package Temp4;

public class Main {
    public static void main(String[] args) {
        Kat kat = new Kat("Murka", 15);
        System.out.println(kat);
//        kat.Voice();
//        kat.comMiy();
        String katCom = "Голос";
        if (katCom == "Сидеть") {
            kat.comSeatDown();}
            if (katCom == "Голос") {
                kat.comMiy();
         }else {
            kat.Voice();
        }

        Dog dog = new Dog("Barboss", 9);
        System.out.println(dog);
        dog.Voice();
        dog.commands();

        Messendger messendger = new Messendger();
        messendger.getMessage();

    }
}
