package lesson9;

public class chess {
    public static void main(String[] args) {
        //нарисовать в консоли шахматную доску 8Х8
        String[][] board = new String[8][8];
        String black = "B";
        String white = "W";
        String vary;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i + j) % 2 == 0) {  //тяжело представляется
                    vary = white;
                } else {
                    vary = black;
                }
                board[i][j] = vary;
            }
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
        }
    }
}