package Konstruktor;

public class MainKonstrukBox {
    public static void main(String[] args) {
        Box myBox = new Box(20,40,4);
        Box myBox1 = new Box(4,7,9);

        System.out.println("Объем первой коробки: " + myBox.getVolume());
        System.out.println("Объем второй коробки: " + myBox1.getVolume());

    }
}
