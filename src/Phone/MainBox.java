package Phone;

public class MainBox {
    public static void main(String[] args) {
        Box box = new Box();
        Box box1 = new Box();

        box.setBox(15,20,10);
        box1.setBox(5,2,4);

        System.out.println("Объем 1-й коробки равен: " + box.getVolume());
        System.out.println("Объем 2-й коробки равен: " + box1.getVolume());

    }
}
