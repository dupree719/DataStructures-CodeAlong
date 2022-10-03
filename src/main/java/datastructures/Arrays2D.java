package datastructures;

import java.util.Arrays;

public class Arrays2D {
    public static void main(String[] args) {

        //Building a 3x3 2D Array for a board game with for loops
        char[][] board = new char[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                board[i][j] = '-';

            }
        }
        //This prints the same exact thing as the for loops above
        char[][] board2 = new char[][] {
                new char[] {'X', '-', '-'},
                new char[] {'X', '-', '-'},
                new char[] {'X', '-', '-'},
        };

        board[0][0] = 'O';
        board[1][0] = 'O';
        board[2][0] = 'O';

        //Use deepToString for 2D Arrays
        System.out.println(Arrays.deepToString(board));
        System.out.println(Arrays.deepToString(board2));

    }

}
