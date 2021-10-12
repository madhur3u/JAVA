import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        pdi(scn.nextInt());      // function call from main
    }

    public static void pdi(int n){
        
        if (n == 0) return;         // base case
        
        System.out.println(n);      // print n 
        pdi(n - 1);                 // assumption 
        System.out.println(n);      // print n
    }
}
/*
n = 3 
  
  0 --> base case return
  1 --> print 1 then recursion --> after base case rturn, print 1
  2 --> print 2 then recursion --> print 2
  3 --> print 3 then recursion --> print 3
  
  >>3
    2
    1
    1
    2
    3
*/
