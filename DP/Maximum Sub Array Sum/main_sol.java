// Kadanes Algorithm
// https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/
// https://leetcode.com/problems/maximum-subarray/
/*
this problem was discussed by Jon Bentley (Sep. 1984 Vol. 27 No. 9 Communications of the ACM P885)

algorithm that operates on arrays: it starts at the left end (element A[1]) and scans through to the right end (element A[n]), 
keeping track of the maximum sum subvector seen so far. The maximum is initially A[0]. Suppose we've solved the problem 
for A[1 .. i - 1]; how can we extend that to A[1 .. i]? The maximum sum in the first I elements is either the maximum sum in 
the first i - 1 elements (which we'll call MaxSoFar), or it is that of a subvector that ends in position i (which we'll call current_Sum).

current_Sum is either A[i] plus the previous current_Sum, or just A[i], whichever is larger.
*/
import java.util.*;
public class Main{
    
    public static void main(String[] args){
        int[] a = {6, -3, 4, 5, -8, 1};
        System.out.println(maxSubarraySum(a, 6));
    }
    
    // function to find max subarray sum using KADANES algorithm
    public static long maxSubarraySum(int a[], int n){
        
        // initialize the current and max sum to be a[0] first
        // means sum of 1st subarray
        // after that we go from 1 to n in loop
        // and update current sum as sum of adjacent elements or a[i]
        // update it to a[i] only if sum of adjacent elements is smaller than a[i]
        // which means we have to start our subarray now from a[i] position 
        int current_Sum = a[0];             
        int max_Sum_so_far = current_Sum;
        
        for (int i = 1; i < n; i++){
            
            current_Sum = Math.max(a[i], a[i] + current_Sum);           // updating current sum
            max_Sum_so_far = Math.max(max_Sum_so_far, current_Sum);     // updating max_sum, this will be max ever current sum obtained 
        }
        return max_Sum_so_far;
    }

    
}

/* solution in python
def maxSubArray(self, a):
        
    cs = ms = a[0]
    
    for i in range(1, len(a)):
        cs = max(cs+a[i], a[i])
        ms = max(cs, ms)
    
    return ms
*/
