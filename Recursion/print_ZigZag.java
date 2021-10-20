// Input  --> 3
// Output --> 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3
// concept of euler tree and how and when which line is executed for a particular n

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        pzz(scn.nextInt());
    }
    
    // exp -->    3 211121112 3 211121112 3
    // assume --> 2 111 2 111 2 is printing and we print 3 ourselves
    // e+a -->    3 pzz(3-1) 3 pzz(3-1) 3
    public static void pzz(int n){
        
        if (n == 0) return; // base case nothing to print just return
        
        System.out.print(n + " ");  // 1st print n
        pzz(n - 1);                 // call pzz(n - 1) this print all n - 1 pattern 
        System.out.print(n + " ");  // 2nd print n 
        pzz(n - 1);                 // 2nd call
        System.out.print(n + " ");  // 3rd print n
    }
}
