// https://www.hackerrank.com/contests/test-3-1633882344/challenges/diagonal-and-wave-traversal

// 1. You are given a number n, representing the number of rows and columns of a square   matrix.
// 2. You are given n * n numbers, representing elements of 2d array a.
// 3. You are required to diagonally traverse the matrix and print the contents.

// 4               input
// 10 11 12 13
// 20 21 22 23
// 30 31 32 33
// 40 41 42 43
  
// 40 41 30 20 31 42 43 32 21 10 11 22 33 23 12 13   output

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        // input starts
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < a.length; i++)  {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = scn.nextInt();
            }
        } 
        // input ends here
        
        // taking the 1st pointer at bottom left as we need to print from that point so i = n-1, j = 0
        int i = n - 1;
        int j = 0;

        // in a square matrix, no of diagonals are always equal to 2*n - 1, so loop till p < 2*n
        // and in each traversal we wil print 1 diagonal
        for(int p = 1; p < 2*n; p++ ){
            
            // when p is odd, means we need to print downwards as we start p from 1
            // and in 1st case we need to print downwards, and so is for case when p is odd
            if (p % 2 != 0){
                
                // so we can analyse from index of our 2d matrix that when we need to stop printing the diagonal
                // we need to inc both i and j to go to next diagonal element
                // if i reaches n means we out from bottom so stop printing
                // if j reaches n means we are out from right end so stop printing
                while (i != n && j != n){
                    System.out.println(a[i][j]);
                    i++;
                    j++;
                }
              
                // changing value of i, j as it has inc in while loop and came out of matrix
                i--;
                j--;
                
                // now we need to decide what will be out next point from which we print upwards
                // as we are in odd block rn next we need to print upwards
                // so check if we ended our printing in bottom then increase j and i will be same
                // and if we are in right end, j will remain same and i will decrease
                // j != n - 1 this is done as in case whenwe are in bottom right, we need to go upwards
                if (i == n - 1 && j != n - 1){
                    j++;
                }
                else{
                    i--;
                }
            }
            
            // printing when p is even, means print upwards
            else {
                
                // here check till i or j is zero
                // both we need to decrease to get to next diagonal element
                while (i != -1 && j != -1){
                    System.out.println(a[i][j]);
                    i--;
                    j--;
                }

                // update values
                i++;
                j++;
                
                // change value for next position, to print downwards
                // i != 0 deals with when we are in top left
                if (j == 0 && i != 0){
                    i--;
                }
                else{
                    j++;
                }   
            }
        }
    }
}
