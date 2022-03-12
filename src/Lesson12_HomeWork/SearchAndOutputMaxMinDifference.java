package Lesson12_HomeWork;

public class SearchAndOutputMaxMinDifference {
    public static void main(String[] args) {
        //найти максимальную сумму
        //найти минимальную разность
        int[] array = {15, 20, 30, 3, 70, 90, 112, 2};
        regularizeArray(array);
        outputArray(array);
        outputMaxMinDifference(array);

    }

    static int[] regularizeArray(int[] array) {
        int tmp;
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    tmp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = tmp;
                }
            }
        }
        return array;
    }

    static void outputArray(int[] array) {
        for (int temp : array) {
            System.out.print(temp + "\t");
        }
        System.out.println();
    }

    static void outputMaxMinDifference(int[] array) {
        System.out.println("Max " + (array[array.length - 1] + array[array.length - 2]));
        System.out.println("Min " + (array[0] - array[array.length - 1]));
    }
}


