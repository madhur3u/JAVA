import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i< n1; i ++)    a[i] = scn.nextInt();  // array 1 input
        
        int n2 = scn.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i< n2; i ++)    b[i] = scn.nextInt();  // array 1 input
        
        int[] diff = new int [n2]; // given n2>=n1 so we make resultant array length equal to n2

        int borrow = 0; // initializing a borrow 
        int i = n1 - 1 ,  j = n2 - 1,  k = n2 - 1; // we have to subtract from end so taking i,j,k as last index of array

        while (k >= 0) { // loop runs till largest number exists

          int d = b[j] - borrow;  // a will be subtracted from b so giving value b to d already and subtracting borrow it may have in previous iteration

          if (i >= 0) d = d - a[i]; // checking for index out of range case a will only be read till its empty

          if (d < 0){ // if we get subtracted value negetive then 

            d = d + 10; // add 10(base) to d to make it positve 
            borrow = 1; // make borrow to be - in next iteration
          }
          else borrow = 0; // borrow should be zero if above case not happen

          diff[k] = d; // putting and in array from last index

          i-- ; j-- ; k--; // decreasing the index
        }
        int index0 = 0;
        while (diff[index0] == 0)  index0++; // there might be trailing zeroes so we have to read from index from which we find 1st non zero number in diff array 
        for (i = index0; i< n2; i ++)    System.out.println(diff[i]);
    }
}