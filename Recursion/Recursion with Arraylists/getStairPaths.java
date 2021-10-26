import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();                          // input no. of stairs
        
        ArrayList<String> paths = getStairPaths(n);     // calling fn
        System.out.println(paths);
    }

    public static ArrayList<String> getStairPaths(int n) {
        
        // base case 1 when no. of stairs are zero
        // we need to return a arraylist with a empty string
        // since 0 --> 0 can be achieved in one way by doing nothing 
        if(n == 0){
            
            ArrayList<String> baseCase0 = new ArrayList<>();
            baseCase0.add("");
            return baseCase0;           // [""] -> 1, 
        } 
        
        // base case 2 when no. of stairs are negetive
        // invalid case so return empty arraylist
        else if(n < 0){
            
            ArrayList<String> baseCaseNegetive = new ArrayList<>();
            return baseCaseNegetive;    // [] -> 0
        }
        
        // we are provided 3 ways to move in stairs, we can take 1 step, 2 steps or 3 steps at a time
        // so we use assumption and get result for all 3 cases in 3 arraylists using recursion
        ArrayList<String> paths1 = getStairPaths(n - 1);    // all results when we take 1 step initially
        ArrayList<String> paths2 = getStairPaths(n - 2);    // all results when we take 2 steps initially
        ArrayList<String> paths3 = getStairPaths(n - 3);    // all results when we take 3 steps initially
        
        // this will hold the result
        ArrayList<String> totalPaths = new ArrayList<>();
        
        // when we take 1 step initially
        // we need to add 1 before each value in list to get all possibe paths when initailly we took 1 step
        for(String path : paths1){
            
            String pathfromn = "1" + path;
            totalPaths.add(pathfromn);          // add in result
        }
        
        // when we take 2 steps initially
        // we need to add 2 before each value in list to get all possibe paths when initailly we took 2 steps
        for(String path : paths2){
            
            String pathfromn = "2" + path;
            totalPaths.add(pathfromn);          // add in result
        }
        
        // when we take 3 steps initially
        // we need to add 3 before each value in list to get all possibe paths when initailly we took 3 steps
        for(String path : paths3){
            
            String pathfromn = "3" + path;
            totalPaths.add(pathfromn);          // add in result
        }
        
        // return the result
        return totalPaths;
    }
}
