import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i<n; i++) a[i] = scn.nextInt();

        int max = a[0], min = a[0];

        for (int i = 0; i<n; i++){

            if (a[i] > max) max = a[i];
            if (a[i] < min) min = a[i];
        }

        int max2 = min,  min2 = max;

        for (int i = 0; i<n; i++){

            if (a[i] < max && a[i] > max2) 
                max2 = a[i];

            if (a[i] > min && a[i] < min2) 
                min2 = a[i];
        }
        System.out.println(max2 + " " + min2);
    }
}
