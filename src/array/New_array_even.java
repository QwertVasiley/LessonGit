package array;

public class New_array_even {
    public static void main(String[] args) {
        // Есть массив чисел.
        // Необходимо создать другой массив
        // содержащий только четные элементы из первого
        int anArray[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        int j = 0; // кол-во ячеек для нового массива
        int d = 0;
        int[] arrayNew;
        for (int i = 0; i < anArray.length; i++) {
            if (anArray[i] % 2 == 0) {
                System.out.println("Найденные четные числа: " + anArray[i]);
                j++;
            }
        }
        System.out.println("Длинна нового массива " + j);
        arrayNew = new int[j]; //установил длинну нового массива
        for (int k = 0; k < anArray.length; k++) {
            if (anArray[k] % 2 == 0) {
                arrayNew[d] = anArray[k];
                System.out.println("Значения нового массива: " + arrayNew[d]);
                d++;
            }
        }
    }
}

