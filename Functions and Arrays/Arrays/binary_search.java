import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i<n; i++) a[i] = scn.nextInt();   // array INPUT array should always be SORTED for binary search
        int k = scn.nextInt();                            // number to find in array
        
        System.out.println(binary_search(a,k));           // calling function and printing values
    }

    public static int binary_search(int[] a,int k){       // function for binary search

      int low = 0;                                        // initialize low and high with 1st and last index
      int high = a.length - 1;
      
      while (low <= high){                                // loop runs till low and high cross each other

        int mid = (low + high) / 2;                       // midpoint of low and high 

        if (k > a[mid])       low = mid + 1;              // update value of low or high depending on the value of k and mid value 
        else if (k< a[mid])   high = mid - 1;
        else                  return mid;                 // return index i.e. mid when k = a[mid]
      }
      return (-1);                                        // if not found return -1
    }
} 