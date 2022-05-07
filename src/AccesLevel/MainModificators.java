package AccesLevel;

public class MainModificators {
    public static void main(String[] args) {
        Modificators modificators = new Modificators(12,15,10,50);

        System.out.println(modificators.num2+ " " + modificators.num3);
        // System.out.println(modificators.num1); // PRIVAT и доступ к нему закрыт

        System.out.println("Protected "+modificators.num4); //можем обратится к нему из другого пакета, если он наследник

        System.out.println(modificators.getNum1()); //создал getter и получил его значение
    }
}
