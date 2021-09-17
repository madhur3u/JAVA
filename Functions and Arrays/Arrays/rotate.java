import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void rotate(int[] a, int k){    // code here
    // write your code here
    int[] b = new int[a.length];
    int n = a.length;
    
    k = k % n;
    if (k < 0) k = n + k;
    
    for (int i = 0; i<n; i++){
        b[k%n] = a[i];
        k++;
    }
    for (int i = 0; i<n; i++){
        a[i] = b[i];
    }
    
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }

}
