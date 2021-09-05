// Given a square matrix, calculate the absolute difference between the sums of its diagonals. 
// https://www.hackerrank.com/challenges/diagonal-difference/problem

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        int s1 = 0, s2 = 0;
        
        for (int i = 0; i<n; i++){
            for (int j = 0; j<n; j++){
                a[i][j] = scn.nextInt();
                if (i == j) s1 = s1 + a[i][j];
                if (i + j == n - 1) s2 = s2 + a[i][j];
                
            }
        }
        if (s1-s2 >= 0) System.out.println (s1-s2);
        else System.out.println (s2 - s1);
    }
}
