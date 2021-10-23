import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = scn.nextInt();
            
        System.out.println(maxInArray(a, 0));   // print max in array
    }

    public static int maxInArray(int[] arr, int i){
        
        //base case --> if i points to the last element in array
        // so only 1 element present we consider that as max and return
        if (i == arr.length - 1) return arr[i];
        
        // take out the max from 1 -> end index and store it in variable
        int current_max = maxInArray(arr, i + 1);
        
        // copare the max with a[0] and return accordingly
        if (arr[i] > current_max)   return arr[i];
        else                        return current_max;
    }
}
