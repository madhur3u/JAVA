import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        pI(scn.nextInt());      // function call from main
    }

    public static void pI(int n){
        
        if (n == 0) return;     // base case
        
        pI(n - 1);
        System.out.println(n);  // will print while returning function, so will print 1 first as 1st return after we get 0 and then in inc order till n   
    }
}
/*
n = 5
  
  5
  4
  3
  2  
  1  this print 1st after return from 0 as print statement is after function calling and after that 2,3,4,5
  0  return
 
  >>1
    2
    3
    4
    5
*/
    
  
