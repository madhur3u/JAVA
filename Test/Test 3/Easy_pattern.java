// https://www.hackerrank.com/contests/test-3-1633882344/challenges/easy-pattern-5/problem

// DONE USING 2D ARRAY

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

// logic is to fill 2d array like this
// 1st fill 1st row with 1 2 3 ....
// then make a variable tr, which check if we need to fill bottom half or upper half
// and acc to that we change value of row and fill the array

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // code here
        int[][] a= new int[n][n];
        
        int i = 0;
        int num = 1;    // this will make our 2D array
        int tr = 0;     // this take cares of no. of traversals which should be n, and also value of i

        while (tr < n){
            tr++;
            
            // we just need to add value to a[i][j -> 0 to n-1] and add num after putting each value
            for (int j = 0; j<n; j++){
                a[i][j] = num ;
                num++;
            }
            // if tr is even means we need to set value in 1st half
            // so change i to tr / 2
            if (tr % 2 == 0){
                i = tr/2;
            }
            // if tr is odd means we need to add value to bottom half
            // so change the value of i accordingly
            else {
                i = (n-1) - tr/2 ;
            }
            
        }

        // printing 2D array
        for( i = 0; i< n; i++){
            for (int j = 0; j<n; j++){  
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
