import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();

        for (int t0 = 0; t0<t; t0++){
        
            int n = scn.nextInt();
            int[] a = new int[n];

            for (int i = 0; i<n; i++) 
                a[i] = scn.nextInt();

            int index = 0, r_index = n - 1;

            for (int i = 0; i<n; i++){

                index = max_index(i, a, n);

                if (index > i && a[index] != a[i]){

                    r_index = i;
                    break;
                }
            }

            // System.out.println(r_index +" "+index);

            int temp = a[r_index];
            a[r_index] = a[index];
            a[index] = temp;

            String ans = "";
            for (int i = 0; i<n; i++) ans = ans + a[i];

            System.out.println(ans);

        }
    }
    public static int max_index(int fi, int[] a, int n){

        int max = a[n-1];
        int index = n-1;

        for (int i = n-1; i>=fi; i--){

            if (a[i] > max) {
                max = a[i];
                index = i; 
            }
        }
        return index;
    }
}
