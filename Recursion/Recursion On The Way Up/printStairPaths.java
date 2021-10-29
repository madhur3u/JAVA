import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        printStairPaths(scn.nextInt(), "");     // fn call
    }

    public static void printStairPaths(int n, String path) {
        
        // base case 1 
        // ans reached, print and return
        if (n == 0){
            System.out.println(path);
            return;
        }
        // base case 2
        // when we have surpassed our ans we just return
        else if (n < 0) return;
        
        // 3 choices so 3 call
        // reduce n and add that number in answer 
        printStairPaths(n - 1, path + "1");
        printStairPaths(n - 2, path + "2");
        printStairPaths(n - 3, path + "3");
    }
}
