import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        toh(scn.nextInt(), scn.nextInt(), scn.nextInt(), scn.nextInt());
        // taking 4 input n and 3 towerIDs
    }
    
    // now we need to move all from A --> B using C
    // exp      --> move all A --> B using C
    // assume 1 --> move n - 1 from A --> C using B   toh (n - 1, A, C, B);
    // print instruction for nth disc to move from A --> B | now A is empty
    // assume 2 --> move n - 1 from C --> B using A   toh (n - 1, C, B, A);
    public static void toh(int n, int A, int B, int C){
        
        // base case
        if (n == 0) return;
        
        toh (n - 1, A, C, B);
        System.out.println(n + "[" + A + " -> " + B + "]");
        toh (n - 1, C, B, A);
        
    }
}
