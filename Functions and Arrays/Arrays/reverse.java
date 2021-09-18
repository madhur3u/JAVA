import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i< n1; i ++)    a[i] = scn.nextInt();  // array 1 input
        
        int i = 0;            // left index
        int j = n1 - 1;   // right index

        while (j > i){

          int temp = a[i]; // swap the value at 1st and last pos first then 2nd and n- 1 and so on
          a[i] = a[j];
          a[j] = temp;

          i++; j--;
        }
        

        for (i = 0; i< n1; i ++)    System.out.print(a[i] + " ");
    }
}