// https://www.pepcoding.com/resources/online-java-foundation/recursion-backtracking/knights_tour/topic

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 3 inputs, n, and row and col of knight (horse)
        int n = Integer.parseInt(br.readLine());
        int row = Integer.parseInt(br.readLine());
        int col = Integer.parseInt(br.readLine());

        // make a n X n 2d array representing chess
        // this chess will also hold our final answer which we print 
        int[][] chess = new int[n][n];
        
        // fn call
        // 1 we will be sending to currentMove as we will be doing 1st move 
        printKnightsTour(chess, row, col, 1);
        
    }

    public static void printKnightsTour(int[][] chess, int r, int c, int currentMove) {
        
        // base case 1 
        // when move of knight is outside the chess board OR
        // knight has moved to a block which it has already covered once
        // 1st case can be handled by checking values of r and c
        // 2nd case can be handled by checking if the block have some value other than zero
        // in both cases move is invalid so return
        if (r >= chess.length || c >= chess.length || r < 0 || c < 0 || chess[r][c] != 0)
            return;
            
        // base case 2
        // when we have not encountered any of above cases and currentMove == chess.length * chess.length
        // since no. of moves = n * n so if this is the case we have reached our answer
        if (currentMove == chess.length * chess.length){
            
            // for this move we have not updated the grid so update that and print answer 
            chess[r][c] = currentMove;
            displayBoard(chess);

            // make it 0 again before return
            chess[r][c] = 0;
            return;
        }
        
        // update the chess board row and col with the current move
        chess[r][c] = currentMove;
        
        // now for a knight(horse) we can have 8 possibilities of moves
        // so we have 8 choices which we will satisfy using recursion
        // since we have used our 1st move and in next call will be 2nd move 
        // therefore currentMove + 1
        printKnightsTour(chess, r - 2, c + 1, currentMove + 1);
        printKnightsTour(chess, r - 1, c + 2, currentMove + 1);
        printKnightsTour(chess, r + 1, c + 2, currentMove + 1);
        printKnightsTour(chess, r + 2, c + 1, currentMove + 1);
        printKnightsTour(chess, r + 2, c - 1, currentMove + 1);
        printKnightsTour(chess, r + 1, c - 2, currentMove + 1);
        printKnightsTour(chess, r - 1, c - 2, currentMove + 1);
        printKnightsTour(chess, r - 2, c - 1, currentMove + 1);
        
        // after all moves have been completed
        // make that block 0 again to get new possible results
        chess[r][c] = 0;
        
    }

    // fn to display 2d array
    public static void displayBoard(int[][] chess) {
        for(int i = 0; i < chess.length; i++){
            for(int j = 0; j < chess[0].length; j++){
                
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
