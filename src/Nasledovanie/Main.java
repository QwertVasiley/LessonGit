package Nasledovanie;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(2,3,5);
        Box box1 = new Box(10,15,7);


        Box box2 = new HeavyBox(15,50,40,45);
        Box box3 = new ColorBox( 15,40,10, "Read");


        System.out.println("Первая коробка " + box.volume());
        System.out.println("Вторая коробка " + box1.volume());
        System.out.println("Третья коробка " +box2.height);
        System.out.println("Четвертая коробка "+ box3.volume());
    }
}
