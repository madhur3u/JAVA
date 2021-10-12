import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        pd(n);
        
    }

    public static void pd(int n){
        
        if (n == 0) return;       // base case
        
        System.out.println(n);    // here printing 1st so 5 printed 1st chnace
        pd(n - 1);                // then recursion with n-1   
    }
}
