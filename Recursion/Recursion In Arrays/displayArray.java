import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
            
        displayArr(a, 0);   // sending the array and 0 to function to display from starting
    }

    public static void displayArr(int[] arr, int i){
        
        if (i == arr.length) return;    // base case, when i has read whole array return
        
        System.out.println(arr[i]);     // E --> print the 1st element
        displayArr(arr, i + 1);         // A --> call fn to print other elements
        
    }
}
