package lesson9;

public class array9_3 {
    public static void main(String[] args) {
        //вывести значения всех строк массива
        int twoDimArray [][] = {{1,2,4},{1,2,5}};
        for (int i = 0; i < twoDimArray.length; i++) { //бежим по строкам
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
