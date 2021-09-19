import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i<n; i++) a[i] = scn.nextInt();     // array input
        
        int x = (int)Math.pow(2,n);                         // 2**n are the number of subsets
        
        for (int i = 0; i<x; i++){                          // loop runs from 0 to 2**n - 1, so loop run till all subsets are displayed

          int[] b = array(dec_to_binary(i),n);              // we are converting i to binary and then the number in binary is converted to array with all elements at different index
          
          for (int j = 0; j<n; j++){                        // this loop runs till number of elements in binary array / original array

            if (b[j] == 0) System.out.print("_\t");         // check the binary array if we find 0 at any idex then - is displayed 
            else System.out.print(a[j] + "\t");             // else we will display the a[j] for the index where it is 1 in binary array
          }
          System.out.println();
        }
    }

    public static int dec_to_binary(int n){                 // this fn convert our i to binary
    
      int p = 1; // 10**0
      int ans = 0;
      while (n>0){

        int r = n % 2; 
        n = n / 2;
        ans += r * p;
        p *= 10; 
      
      }
      return ans;
    }
    public static int[] array(int n,int d){                 // this fn take the binary no. eg 001 and convert it to array [0,0,1]

      int[] b = new int[d];
      int k = d-1;

      while (n > 0){
        b[k] = n % 10;
        n = n / 10;
        k--;
      }
      return b;
    }
} 