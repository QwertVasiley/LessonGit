package ReturnObject;

public class ReturnObject {
    int a;

    public static void main(String[] args) {
        ReturnObject ob1 = new ReturnObject(2);
        ReturnObject ob2 = ob1.incrementByTen();
        System.out.println("ob1.a: " + ob1.a);
        System.out.println("ob2.a: " + ob2.a);
    }

    ReturnObject(int i) {
        a = i;
    }

    ReturnObject incrementByTen() {
        ReturnObject temp = new ReturnObject(a + 10);  //для изменения значения объекта создали новый объект и его вернули
        return temp;
    }
}
