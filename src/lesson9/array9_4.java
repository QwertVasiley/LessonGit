package lesson9;

public class array9_4 {
    public static void main(String[] args) {
        //вывести в консоль массив {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}}
        int twoDimArray[][] = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.print(twoDimArray[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
