import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                arr[i][j] = scn.nextInt();  // inputs
        
        floodfill(arr, 0, 0, "");           // fn call
    }
    
    // quite same like maze path but here we have 4 possible paths t, l, d, and r
    // so we have 4 choices --> 4 calls and some other checks
    public static void floodfill(int[][] maze, int sr, int sc, String ans) {
        
        // base case 1 if destination reached
        // print ans 
        if (sr == maze.length - 1 && sc == maze[0].length - 1){
            System.out.println(ans);
            return;
        }
        
        // base case 2
        // if we have reached out of the matrix
        // or if we had encountered a blockade i.e. maze[sr][sc] == 1
        if (sr < 0 || sr >= maze.length || sc < 0 || sc >= maze[0].length || maze[sr][sc] == 1) return;
        
        
        // we have to check for infinite looping
        // if we have been to a block we need to make that a blockade
        // as if we dont do that for left and right call or t d call we will loop infinitely
        maze[sr][sc] = 1;
        
        floodfill(maze, sr - 1, sc, ans + "t");      // top, so row decrease
        floodfill(maze, sr, sc - 1, ans + "l");      // left, so column decrease
        floodfill(maze, sr + 1, sc, ans + "d");      // down, so row increase
        floodfill(maze, sr, sc + 1, ans + "r");      // right, so column increase
        
        // at the end after all fn calls have been made
        // remove the blockade which we made as if we didnt
        // then we will not be able to make other paths as evertything is 1 now
        maze[sr][sc] = 0;
    }
}
