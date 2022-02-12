package lesson9;

public class array9_2 {
    public static void main(String[] args) {
        //двумерные массивы (матрицы)
        //int [][]twoDimArray;  //объявняем двумерный массив


        // twoDimArray = new int[2][3]; //проинициализировали 2 строки и 3 столбца

      //int twoDimArray [][] = {{1,2},{1,2}}; // можно и так создавать (прямая инициализация)

            int [] [] twoDimArray = {{5,7,3,17},{7,0,1,12},{8,1,2,3}};
            System.out.println(twoDimArray.length); // возвращает количество массивов в массиве (строк)
        System.out.println(twoDimArray[1].length); // возвращает длинну второго масива


    }
}
