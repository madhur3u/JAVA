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
        
        // we can either move horizontal or vertical in one step
        
        // first we use recursion to get results for all other cases when we move horizontal
        // then add 'h' in front of every result from recursive call
        // we get all paths from sc + 1 and sr, sc + 1 is done as we move horizontal one step manually
        ArrayList<String> prevHPaths = getMazePaths(sr, sc + 1, dr, dc);
        
        for (String val : prevHPaths){
            totalPaths.add("h" + val);
        }
        
        // now we have all horizontal paths in totalPaths list
        // now we need to add all paths when 1st step is vertical down
        // sr + 1 as we move vertical
        ArrayList<String> prevVPaths = getMazePaths(sr + 1, sc, dr, dc);
        
        for (String val : prevVPaths){
            totalPaths.add("v" + val);
        }
        
        // all paths are in our list
        return totalPaths;
    }

}
