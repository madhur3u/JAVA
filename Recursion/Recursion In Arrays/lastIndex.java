import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
            
        int x = scn.nextInt();  // number whose last index to be found
            
        System.out.println(lastIndex(a, a.length - 1, x));    // function call 
    }
    
    // go from last till 1st and return the 1st occurence from last 
    public static int lastIndex(int[] arr, int i, int k){
        
        // base case
        // when the i has reached -1, return -1 as nothing is here
        if (i == -1) return -1; 
        
        // we find the current Index of k in array from 1 -> end index
        // store it in a variable and if it hasn't found that the variable must have -1 due to base case
        int current_index = lastIndex(arr, i - 1, k);
        
        // if we found k at a[end index] or the cuurent i return the i as it is the index in which we found
        // else return whatever we had in the current index
        if (arr[i] == k)    return i;
        else                return current_index;   
    }
}
