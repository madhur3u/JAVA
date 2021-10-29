import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
	        
        Scanner scn = new Scanner(System.in);
        printMazePaths(1, 1, scn.nextInt(), scn.nextInt(), "");
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    public static void printMazePaths(int sr, int sc, int dr, int dc, String ans) {
        
        // base case 1 when we reach destination, print and return
        if (sr == dr && sc == dc){
            System.out.println(ans);
            return;
        }
        // base case 2 when we have moved out of maze, just return
        else if(sr > dr || sc > dc) return;
        
        // horizontal move, inc in column
        // add h in ans as we move 1 step horizontal
        printMazePaths(sr, sc + 1, dr, dc, ans + "h");
        
        // vertical move, inc in row
        // add v in ans as we move 1 step vertical
        printMazePaths(sr + 1, sc, dr, dc, ans + "v");
    }
}
