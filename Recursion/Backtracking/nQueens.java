// https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/n_queens/topic

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        // System.out.println("Hello");
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] chess = new int[n][n];
        printNQueens(chess, "", 0);
    }

    public static void printNQueens(int[][] chess, String queensSoFar, int row) {

        // base case
        // in the solution we are traversing in rows using recursion
        // so if we reach out of the grid we print our answer and return
        if (row >= chess.length){

            System.out.println(queensSoFar + ".");
            return;
        }

        // in each row we can only put one queen and that can be at any col
        // so loop for column and put queen once in each col and check for that
        for (int col = 0; col < chess.length; col++){

            // this checks if we can place the queen there or not acc to question
            if (isQueenSafe(chess, row, col)){
                
                // if we can place the queen make that element in grid as 1
                // and call the fn to put queen in next row, therefore row + 1
                // also put this queens position in answer --> queensSoFar + row + "-" + col + ", "
                chess[row][col] = 1;
                printNQueens(chess, queensSoFar + row + "-" + col + ", ", row + 1);
                chess[row][col] = 0;
                // after recursive call ends, make the 1 0 again as we need to check for other cases too
            }
        }    
    }

    // in this we have to check if we can place the queen in the particular row and column
    // for that there should be no queen above it or in any of its diagonals
    // not checking below as we make grid from top to bottom
    // and not checking same row as at a time we place only one queen in each row
    public static boolean isQueenSafe(int[][] chess, int row, int col) {

        // checking if there is a queen above in same column
        for (int i = row - 1, j = col; i >= 0; i--){
            if (chess[i][j] == 1) return false; 
        }

        // checking if queen in left diagonal
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--){
            if (chess[i][j] == 1) return false; 
        }

        // checking if queen in right diagonal
        for (int i = row - 1, j = col + 1; i >= 0 && j < chess.length; i--, j++){
            if (chess[i][j] == 1) return false; 
        }

        return true;
    }
}
