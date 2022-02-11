package lesson9;

public class sum_diagonal_var2 {
    public static void main(String[] args) {
        // Сумма диагонали квадратной матрицы
        int[][] array = {{1, 2, 3, 4}, {4, 3, 2, 1}, {7, 8, 9, 6}, {6, 5, 4, 3}};
        int sum = 0;
        int j = 0;
        //ok, but could also do it in more "mathematical" way
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i][j];
            j++;
        }
        System.out.println("Сумма чисел диагонали матрицы: " + sum);
    }
}
