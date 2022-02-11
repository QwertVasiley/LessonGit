package lesson9;

public class sum_diagonal {
    public static void main(String[] args) {
        //Сумма диагонали матрицы
        int[][] array = {{1, 2, 3, 4}, {4, 3, 2, 1}, {7, 8, 9, 6}, {6, 5, 4, 3}};
        int sum = 0;
        int i = 0;
        int j = 0;
        do {
            sum = sum + array[i][j];
            i++;
            j++;
        } while (j < array.length);
        System.out.println("Сумма диагонали матрицы: " + sum);
    }
}
