import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        solution(str);
    }

    public static void solution(String str){
        
        int len = str.length();     // length of string 
        int n = factorial(len);     // no of permutations are factorial of no. of elements
        // System.out.println(n);  

        for(int i = 0; i < n; i++){ 

            StringBuilder sb = new StringBuilder(str);  // stringbuilder of given string 
            StringBuilder ans = new StringBuilder();    // this will hold a permutation at each iteration
            int temp = i;                               // assigning i to temp variable

            for (int j = len; j>=1; j--){               // loop from len to 1
                
                ans.append(sb.charAt(temp%j));          // append one character in ans
                sb.deleteCharAt(temp%j);                // delete the same char from sb

                temp = temp/j;                          // change temp 
            }
            System.out.println(ans);                    // print ans
        }
    }

    // this give us factorial of a number
    public static int factorial(int n){
        // write your code here
        if (n == 0) return 1;
        int f = n * factorial(n - 1);
        return f;	
    }
}
