// You are given an array of N positive integers which represent digits of a number. You have to form the largest number possible after 
// performing an operation exactly once. The operation is - Select two indices a and b, and swap their values. Print the largest number formed.
    
// https://nados.pepcoding.com/content/986574de-de28-4d20-9b95-c8b764ce1d05/e57ae4c3-3429-4f12-aeaf-dca20e49821c/
/*
we have to find what is the largest number we can form after doing exactly 1 swap

1 2 5 4 7 9
here we have to swap 1st value 1 with last 9 to get 925471 which is largest no. possible after 1 swap 

9 8 7 1 2 3 4 5
in this the 1st 2nd and 3rd are already arranged in max order so we need to swap 4th no. i.e. 1 with max number from 1 2 3 4 5 i.e. 5 -> 98752341
    
9 9 9 8 8 9 9 1
in this the 1st 8 will be replaced with 2nd last 9 -> 99998981

9 8 7 4 5 4 2 9 -> 99745428
    
1. check if max no. in 1st index if it is find max from 2nd index till end and so on
2. find min no. after all max like first 8 in last ex and take its INDEX in r_index
3. check max no. from last till index where we need to check max to cope up with repititions and store its index in 'index'
4. swap values of index and r_index places */

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int t0 = 0; t0<t; t0++){                   // number of test cases
        
            int n = scn.nextInt();
            int[] a = new int[n];

            for (int i = 0; i<n; i++) 
                a[i] = scn.nextInt();                   // array index

            int index = 0, r_index = n - 1;             // index and r index will be the indexes of places to swap

            for (int i = 0; i<n; i++){                  

                index = max_index(i, a, n);             // func will find index of max number from index n to i, will find max from last till ith index

                if (index > i && a[index] != a[i]){     // the value of index should be greater than i, this ensure max no. is not at ith place, a[index] != a[i] ensure max no. is not equal to ith number 

                    r_index = i;                        // if we found a index whixh follow all criteria we break 
                    break;                              // ith position will be of the number to swap with index position
                }
            }

            // System.out.println(r_index +" "+index);

            int temp = a[r_index];                      // swapping values
            a[r_index] = a[index];
            a[index] = temp;

            String ans = "";                            // array to store answer as we need to print whole number not array
            for (int i = 0; i<n; i++) ans = ans + a[i];

            System.out.println(ans);

        }
    }
    public static int max_index(int fi, int[] a, int n){

        int max = a[n-1];                   // let max number be last, as we traverse from last here
        int index = n-1;                    // 1st index also last

        for (int i = n-1; i>=fi; i--){      // array from last to fi 

            if (a[i] > max) {               // this find max and the index at which max found
                max = a[i];
                index = i; 
            }
        }
        return index;                       // return the index
    }
}
