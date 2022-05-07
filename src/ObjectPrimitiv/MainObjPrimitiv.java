package ObjectPrimitiv;

public class MainObjPrimitiv {
    public static void main(String[] args) {
        Box box = new Box(10,20);
        int a=10;
        int d = 20;

        System.out.println("a, d, перед вызовом " + a +" "+ d);
        changePrimitive(a,d);
        System.out.println("a, d, после вызова " +a + " "+d); //вывод олучился одинаковый

        System.out.println("box, перед вызовом "+ box.q + " "+ box.w);
        changeObg(box);
        System.out.println("box, после вызова "+ box.q + " "+ box.w);

    }
    static void changePrimitive (int a, int d){
        a *=2;
        d /=2;
    }

    static void changeObg (Box box){
        box.q *= 2;
        box.w /= 2;
    }


}
