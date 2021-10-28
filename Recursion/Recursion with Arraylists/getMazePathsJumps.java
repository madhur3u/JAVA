import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        
        ArrayList<String> paths = getMazePaths(1, 1, rows, cols);
        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column
    
    // to find all ways from which we can reach from start till end of maze
    // eg ->                                         1       1       3       3
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        
        // base case 1 
        // when we reached destination 3 3 so sr == dr && sc == dc
        // we return a arraylist with 1 empty element
        if (sr == dr && sc == dc){
            
            ArrayList<String> base1 = new ArrayList<>();
            base1.add("");
            return base1;
        }
        
        // base case 2
        // when adding on sc and dc make them greater than sr and dc
        // in this case we just need to return to previous recursive step
        else if (sr > dr || sc > dc){
            
            ArrayList<String> base2 = new ArrayList<>();
            return base2;
        }
        
        // this will hold all paths
        ArrayList<String> totalPaths = new ArrayList<>();
        
        // horizontal moves
        // first find out total no. of horizontal moves we can make
        // that will be equal to dc - sc so we can move h1, h2 steps for dc = 3
        // loop for hrizontal steps 
        for (int steps = 1; steps <= (dc - sc); steps++){
            
            ArrayList<String> prevHPaths = getMazePaths(sr, sc + steps, dr, dc);
            
            for (String val : prevHPaths){
                totalPaths.add("h" + steps + val);
            }
        }
        
        // same logic for vertical steps too,
        for (int steps = 1; steps <= (dr - sr); steps++){
            
            ArrayList<String> prevVPaths = getMazePaths(sr + steps, sc, dr, dc);
        
            for (String val : prevVPaths){
                totalPaths.add("v" + steps + val);
            }
        }
        
        // now for diagonal steps we have to move 1 step both row and col
        // and need to check for both rows and col which should be in range
        for (int steps = 1; steps <= (dr - sr) && steps <= (dc - sc); steps++){
            
            ArrayList<String> prevDiagPaths = getMazePaths(sr + steps, sc + steps, dr, dc);
        
            for (String val : prevDiagPaths){
                totalPaths.add("d" + steps + val);
            }
        }
        
        // all paths are in our list
        return totalPaths;
    }
}
