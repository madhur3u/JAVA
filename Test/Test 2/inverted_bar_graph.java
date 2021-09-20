import java.util.*;

public class main {
    public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];
    
    int max = 0;
    
    for (int i =0; i<n; i++){ 
        a[i]= scn.nextInt();
        if (a[i] > max) max = a[i];
    }
    scn.close();

    for (int i = 0; i<max; i++){
        
        for (int j = 0; j<n; j++){
            
            if (a[j] > i)  System.out.print("*	");
            else           System.out.print("	");
        }
        System.out.println();
    }
  }
}