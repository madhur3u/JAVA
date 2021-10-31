import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
      
        for (int i = 0; i < n; i++)
            arr[i] = scn.nextInt(); 
            
        int target = scn.nextInt();
            
        printTargetSumSubsets(arr, 0, "", 0, target);   // fn call
    }

    // ans --> is the subset
    // sum --> is sum of subset
    // i   --> is the current index of array
    public static void printTargetSumSubsets(int[] a, int i, String ans, int sum, int target) {
        
        // base case when we have traversed whole array
        if (i >= a.length){
            
            // check if sum == target
            // and print ans if true
            if (sum == target){
                System.out.println(ans + ".");
            }
            return;
        }
        
        // we have 2 choices for subset
        // either element will be selected or not
        // if selected we add that element in ans to form subset string
        // and add that a[i], as we check if sum of that subset is target or not
        // i + 1 as in next call we need to check for next element of the array
        
        printTargetSumSubsets(a, i + 1, (ans + a[i] + ", "), (sum + a[i]), target); // a[i] selected
        printTargetSumSubsets(a, i + 1, ans, sum, target);                          // a[i] rejected
        // in rejection case, string or sum nothing is updated only index
    }
}
