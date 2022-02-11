package lesson9;

import java.util.Scanner;
//+
public class number_search {
    public static void main(String[] args) {
        int[][] twoDimArray = {{5, 7, 3, 17}, {7, 0, 1, 12}, {8, 1, 2, 3}};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи число, которое будем искать: ");
        int numSearch = scanner.nextInt();
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                if (numSearch == twoDimArray[i][j]) {
                    System.out.println(i + "" + j);
                }
            }
        }
    }
}

