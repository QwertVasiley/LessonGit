package Lesson25_3;

public class Main {
    public static void main(String[] args) {
        //Найти количество локальных максимумов и минимумов последовательности

        int array [] = {10,7,15,3,9,4,12,2,7,11,25,11,45,3,94,63,45,95,7};

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }
        LocalMax localMax = new LocalMax(array);
        LocalMin localMin = new LocalMin(array);

        localMax.start();
        localMin.start();
    }
}
