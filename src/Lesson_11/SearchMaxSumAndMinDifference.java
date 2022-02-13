package Lesson_11;

public class SearchMaxSumAndMinDifference {
    public static void main(String[] args) {
        //найти максимальную сумму
        //найти минимальную разность
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2};
        int max1 = array[0];
        int max2 = array[0];
        int min1 = array[0];
        int min2 = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max1 < array[i]) {
                max1 = array[i];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (max2 < array[j] && max1 != array[j]) {
                max2 = array[j];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (min1 > array[i]){
                min1=array[i];
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (min2>array[i] && min1!=array[i]){
                min2=array[i];
            }
        }
        System.out.println(max1 + " + " + max2 + " = " + (max1 + max2));
        System.out.println(min1 + " - " + min2 + " = " + (min1-min2));
    }
}


