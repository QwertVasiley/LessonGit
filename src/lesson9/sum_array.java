package lesson9;
//+
public class sum_array {
    public static void main(String[] args) {
           //Посчитать сумму элементов в каждой строке массива
        int sum = 0;
        int array[][] = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sum = sum + array[i][j];
            }
            System.out.println("сумма " + i + " строки: " + sum);
            sum = 0;
        }
    }
}
