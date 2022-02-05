package array;

public class Lesson7_6 {
    public static void main(String[] args) {
//ЗАменить нечетные на Ноль
        int[] anArray = {1, 2, 3, 6, 8, 4, 45, 12, 46, 7, 20};
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] % 2 != 0) {
                anArray[i] = 0;
            }
            System.out.println(anArray[i]);
        }
    }
}
