import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int x = Integer.parseInt(br.readLine());    // no. to find indices of
        int[] iarr = allIndices(arr, x, 0, 0);      // calling fn and storing result in iarra array

        if(iarr.length == 0){
            System.out.println();
            return;
        }
        
        // print the result
        for(int i = 0; i < iarr.length; i++){
            System.out.println(iarr[i]);
        }
    }
    
    // this can be done very easily using arraylist
    // logic with arrays, we take a count of k in a, and at base case we will make a array with k length and return that array
    // then we will fill that array post call with the index at which we found array
    public static int[] allIndices(int[] a, int k, int i, int kCount) {
        
        // base case --> make a array with length kCount and return that
        if (i == a.length){            
            int[] arr = new int[kCount];
            return arr;
        }
        
        // this will hold the resultant array
        int[] resultArray;
        
        // when value is found 
        if (a[i] == k){
            
            // we call the function to get a array with all indices at which k is present from 1 --> end
            // increase i to get next index in recursive call
            // kCount is inc as we found 1 k already 
            resultArray = allIndices(a, k, i + 1, kCount + 1);
            
            // now put the index at the kCount poistion which is the 1st index we found k
            resultArray[kCount] = i;
        }
        
        // if a[i] is not k just inc i and call fn
        else{
            resultArray = allIndices(a, k, i + 1, kCount);    
        }
        
        // return the answer
        return resultArray;
    }
}
