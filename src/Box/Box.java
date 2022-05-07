package Box;

public class Box {

    private int a;
    private int b;
    private int h;
    private static int count;   //счетчик кол-ва коробок

//    public Box() {
//        count++;
//    }

    public static int getBoxCount() {
        return count;
    }

    public Box(int a, int b, int h) {
       // this();
        this.a = a;
        this.b = b;
        this.h = h;
count++;
    }

    @Override
    public String toString() {
        return "Коробка {" +
                "Длина=" + a +
                ", Ширина=" + b +
                ", Высота=" + h +
                '}';
    }

    public int volume() {
        int volBox = a * b * h;
        return volBox;
    }
}