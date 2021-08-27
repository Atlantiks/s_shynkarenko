package homework3;

import java.util.Arrays;

public class ChessBoard {
    public static void main(String[] args) {
        String[][] board = new String[8][8];

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
                    board[i][j] = "W";
                } else {
                    board[i][j] = "B";
                }
            }
        }

        for (int i = 0; i < 8; i++) {
            System.out.println(Arrays.toString(board[i]));
        }

    }
}
