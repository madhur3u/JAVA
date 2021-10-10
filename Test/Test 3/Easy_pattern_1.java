// https://www.hackerrank.com/contests/test-3-1633882344/challenges/easy-pattern-5/problem

/*1. You are given a number n.
2. You've to create a pattern as shown in output format.

For 6, the output should be ->
1 2 3 4 5 6
13 14 15 16 17 18
25 26 27 28 29 30
31 32 33 34 35 36
19 20 21 22 23 24
7 8 9 10 11 12 

for 5
1 2 3 4 5
11 12 13 14 15
21 22 23 24 25
16 17 18 19 20
6 7 8 9 10

*/

// first time i didnt saw that we cant do it with array
// since this was array test so i thought we have to do this with 2d array

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int v = 1;
        for(int i = 1; i<=n; i++){

            int val = v;

            // simply printing whole row
            for (int j = 1; j<=n; j++){

                System.out.print(val + " "); 
                val ++;                         // inc value fro next 
            }

            // changing value for next row 
            // when no. of rows are even
            if(n % 2 == 0){                

                if(i < n/2)                 v = v + 2*n;    // 1st half

                else if (i == n/2)          v = v + n;      // middle 

                else                        v = v - 2*n;    // 2nd half
            }

            // changing value for next row
            // when no. of rows are odd
            if(n % 2 != 0){                
                
                if(i < n/2 + 1)             v = v + 2*n;    // 1st half

                else if (i == n/2 + 1)      v = v - n;      // middle row

                else                        v = v - 2*n;    // 2nd hald
            }

            System.out.println();
        }   
    }
}
