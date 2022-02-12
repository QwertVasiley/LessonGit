package lesson9;
import java.util.ArrayList;

public class temp {
    public static void main(String[] args) {


        ArrayList <String> cars = new ArrayList<>();


        cars.add("ferrari"); //добавили элемент
        cars.add("bugatti"); // еще добавили элемент
        cars.add("lambo");  // и еще добавили элемент

        cars.add(2,"MAZ");  // впихнули элемент во 2-ю позицию

        System.out.println(cars.size());  // вызвали длинну массива

        System.out.println("Вызываем элемент с 3-м индексом "+ cars.get(3));

    }
}
