import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
            
        int x = scn.nextInt();  // number whose 1st index to be found
            
        System.out.println(firstIndex(a, 0, x));    // function call 
    }

    public static int firstIndex(int[] arr, int i, int k){
        
        // base case
        // when the array has ended return -1 or if array length is 0
        if (i == arr.length) return -1; 
        
        // we find the current Index of k in array from 1 -> end index
        // store it in a variable and if it hasn't found that the variable must have -1 due to base case
        int current_index = firstIndex(arr, i + 1, k);
        
        // if we found k at a[0] or the cuurent i return the i as it is the index in which we found
        // else return whatever we had in the current index
        if (arr[i] == k)    return i;
        else                return current_index;
    }

}
