import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
            
        displayArrReverse(a, 0);   // sending the array and 0 to function to display from starting
    }

    public static void displayArrReverse(int[] arr, int i){
        
        if (i == arr.length) return;    // base case, when i has read whole array return
        
        displayArrReverse(arr, i + 1);  // A --> call fn to print other elements, since this is called before print so it will first print the last element 
        System.out.println(arr[i]);     // E --> print the 1st element post call
    }
}
