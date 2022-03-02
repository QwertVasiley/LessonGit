package Lesson12_HomeWork;

public class CopyArray {
    public static void main(String[] args) {
        //Скопировать массив в другой
        int[] array = {15, 20, 30, 50, 17, 40, 80, 90, 115, 7, 5, 9};
        int[] array2 = copyArray(array);
        System.out.print("Скопированный массив: " + "\t");
        outputArray(array2);
    }

    static int[] copyArray(int[] array) {
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }
        return array2;
    }

    static void outputArray(int[] array) {
        for (int temp : array) {
            System.out.print(temp + "\t");
        }
    }
}