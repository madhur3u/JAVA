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
        // add h + steps in ans as we move 'steps' step horizontal
        for (int steps = 1; steps <= (dc - sc); steps++){
            printMazePaths(sr, sc + steps, dr, dc, ans + "h" + steps);
        }
        
        // vertical move, inc in row
        // add v + 'steps' in ans as we move 'steps' step vertical
        for (int steps = 1; steps <= (dr - sr); steps++){
            printMazePaths(sr + steps, sc, dr, dc, ans + "v" + steps);
        }
        
        // diagonal move, inc in row and col both
        // add d + 'steps' in ans as we move 'steps' step diagonal
        for (int steps = 1; steps <= (dr - sr) && steps <= (dc - sc); steps++){
            printMazePaths(sr + steps, sc + steps, dr, dc, ans + "d" + steps);
        }
    }
}
