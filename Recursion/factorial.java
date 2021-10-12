import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        System.out.println(factorial(scn.nextInt()));   // func call and print let n = 5
    }

    public static int factorial(int n){
        
        if(n == 0) return 1;            // base case as 0 is the smallest number whose fact is possible and 0! = 1
        
        int f = n * factorial(n - 1);   // n * assumption
        return f;                       // return f
    }
}
/*
n = 5
  
  0   return 1
  1   f = 1 * funccall return --> *1 --> returns 1
  2   f = 2 * funccall return --> *1 --> returns 2
  3   f = 3 * funccall return --> *2 --> returns 6
  4   f = 4 * funccall return --> *6 --> returns 24
  5   f = 5 * funccall return --> *24 --> returns 120 to main
  
  >>> 120
*/
