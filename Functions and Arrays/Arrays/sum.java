import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a = new int[n1];
        for (int i = 0; i< a.length; i ++)    a[i] = scn.nextInt();  // array 1 input
        
        int n2 = scn.nextInt();
        int[] b = new int[n2];
        for (int i = 0; i< b.length; i ++)    b[i] = scn.nextInt();  // array 1 input
        
        int[] sum = new int [n1 > n2 ? n1 : n2];

        int carry = 0;
        int i = n1 - 1 ,  j = n2 - 1,  k = sum.length - 1;

        while (k >= 0) {

          int d = carry;

          if (i >= 0) d = d + a[i];
          if (j >= 0) d = d + b[j];

          carry = d / 10;
          d = d % 10;

          sum[k] = d;

          i-- ; j-- ; k--;
        }
        if (carry != 0) System.out.println(carry);
        for (i = 0; i< sum.length; i ++)    System.out.println(sum[i]);
    }
}