import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();            // let x = 2
        int n = scn.nextInt();            // let n = 4
        
        System.out.println(power(x, n));  // func call and print
    }

    public static int power(int x, int n){
        
        if (n == 0) return 1;           // base case, anything to power 0 is 1 
        
        int p = x * power(x, n - 1);    // x * assumption for n - 1
        return p;                       // return p       
    }
}
/*
x = 2, n = 4
  
  0   base case returns  1
  1   p = 2 * return  --> 2*1 --> return 2
  2   p = 2 * return  --> 2*2 --> return 4
  3   p = 2 * return  --> 2*4 --> return 8
  4   p = 2 * return  --> 2*8 --> return 16  to main
  |
  n
  
  >>> 16
*/
