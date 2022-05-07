package Box;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(3,4,2); //есть коробка с размерами
        Box box1 = new Box(1,2,3); //еще одна коробка
        Box box2 = new Box(10,15,20); // третья коробка
        System.out.println(box);
        System.out.println("Объем коробки: " + box.volume());
        System.out.println("Вторая " + box1);
        System.out.println("Объем второй коробки: " + box1.volume());
        System.out.println("Третья " + box2);
        System.out.println("Объем третьей коробки: " + box2.volume());

        System.out.println("Всего коробок: "+ Box.getBoxCount());
    }
}
