import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i< a.length; i ++)    a[i] = scn.nextInt();  // array input

        int max = a[0], min = a[0];

        for (int i = 1; i< a.length; i ++){

            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }      
        System.out.println(max - min);  
    }
}
    
