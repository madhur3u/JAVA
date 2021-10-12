// https://leetcode.com/problems/maximum-subarray/

// using Prefix Sum

import java.util.*;
public class Main{
    
    public static void main(String[] args){
        int[] a = {6, -3, 4, 5, -8, 1};
        System.out.println(maxSubarraySum(a, 6));
    }
    
    public static long maxSubarraySum(int a[], int n){
        
        // calculating prefix sum first 
        int[] prefixSum = new int[n];
        prefixSum[0] = a[0];

        for (int i = 1; i < n; i++){
            prefixSum[i] = prefixSum[i - 1] + a[i];
        }

        // now we have prefix sum so rather than using 3rd loop for taking sum of sub array
        // we will use prefix sum for subarray sum
        // eg for 0 -5 subarry sum will be --> prefixSum[5]
        // for 0 - 2 will be prefixSum[2]
        // for 2 - 5 it will be prefixSum[5] - prefixSum[1]
        // so for (i, j) -->    prefixSum[j] - prefixSum[i - 1] using this formula to calculate subarray sum

        int max_sum = a[0];

        for (int i = 0; i < n; i++){
            for (int j = i; j < n; j++){
                
                // for i == 0 sum will be from 0 - j, so directly prefixSum[j] 
                // also save us from index out of range error
                // taking max of max_sum obt till now and current sum that will be from prefix sum
                if (i == 0) 
                    max_sum = Math.max(max_sum, prefixSum[j]);
                else
                    max_sum = Math.max(max_sum, prefixSum[j] - prefixSum[i - 1]);
            }   
        }        
        return max_sum;
    }
}
