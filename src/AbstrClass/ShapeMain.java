package AbstrClass;

public class ShapeMain {
    public static void main(String[] args) {
        Shape[]shapes =  new Shape[4];

        shapes [0] = new Circle("Blue",15,20,10);
        shapes [1] = new Rectangle("Black", 15,18,14,7);
        shapes[2] = new Circle("White", 20,40,14);
        shapes[3] = new Rectangle("Read", 45,19,22,44);

        for (Shape sh: shapes) {
            sh.drow();
        }
    }
}
