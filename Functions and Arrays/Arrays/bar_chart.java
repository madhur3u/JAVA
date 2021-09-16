import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i< a.length; i ++)    a[i] = scn.nextInt();  // array input
        
        int max = a[0] ;
        for (int i = 1; i< a.length; i ++) if (a[i] > max) max = a[i]; // we get the max value in array
    
        for (int i = max; i > 0; i--){
            for (int j = 0; j< a.length; j ++) {

                if (a[j] >= i) System.out.print("*\t");
                else System.out.print("\t");

            }   
            System.out.println();
        } 
    }
}
    
