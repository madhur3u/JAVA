import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i<n; i++) a[i] = scn.nextInt();   // array INPUT array should always be SORTED for binary search
        int money = scn.nextInt();                        // number to find in array
        
        int[] range = binary_search(a,money);
        
        System.out.println(range[0] + "\n" + range[1]);         
    }

    public static int[] binary_search(int[] a,int k){     // this fn search if value present or not if yes give value else give its floor and ceil  

      int low = 0;                                        
      int high = a.length - 1;
      int[] range = new int[2];
      
      while (low <= high){                               

        int mid = (low + high) / 2;                       

        if (k > a[mid])       low = mid + 1;              
        else if (k< a[mid])   high = mid - 1;
        
        else{                                             // if we found our no. then we need to return the number only so we give both value as a[mid]
          range[0] = a[mid];
          range[1] = a[mid];
          return range;
        }    
      }
      if (high < 0) high = 0;                             // these check for corner cases if the number is less then min of array or more than max of array
      if (low > a.length - 1) low = a.length - 1;

      range[0] = a[low];                                  // if no. not present then in binary search the high and low will be the floor and ceil to the number
      range[1] = a[high];                                 // so we put them in array and return
      return range;    
    }                                                                         
} 