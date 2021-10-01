// 1. You are given a number n, representing the size of array a.
// 2. You are given n numbers, representing elements of array a.
// 3. You are given a number k.
// 4. Rotate the array a, k times to the right (for positive values of k), and to the left for negative values of k.
//  1 2 3 4 5 , k = 3 => 3 4 5 1 2 -> last ke 3 uth kar aage aa gaye

import java.io.*;

public class test {

    public static void display(int[] a){            // just used to print Array
        StringBuilder sb = new StringBuilder();
    
        for(int val: a){
          sb.append(val + " ");
        }
        System.out.println(sb);
      }
    
    public static void rotate(int[] a, int k)       // roatating array
    {
        k = k % a.length;                           // update k if greater than length of array
        if(k < 0)   k = k + a.length;               // handling case when k is negetive

        /*
        The logic is to divide array into two parts
        First part is before k
        2nd part is after k till end
        now reverse both parts
        and finally reverse whole array
        */
        reverse(a, 0, a.length - k - 1);            // reverse 1st part 
        reverse(a, a.length - k, a.length - 1);     // reverse 2nd part
        reverse(a, 0, a.length - 1);                // reverse whole array to get rotated array
    }

    public static void reverse(int[] a, int low, int high)  // reverse a part of array from low to high
    {
        while (low < high)
        {
            int temp = a[low];
            a[low] = a[high];
            a[high] = temp;
            
            low++;
            high--;
        }
    }

    // main 
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(br.readLine());
        
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);

   
    }
}
