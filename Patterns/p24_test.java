import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    // write your code here
    int val = 1;
    int v1 = 2 * n + 1;
    int v2 = 3 * n;

    for (int i = 1; i <= n; i++) {

      if (i == 1) { // 1st line
        for (int j = 1; j <= n; j++) {
          System.out.print(val + " ");
          val++;
        }

      }
      else if (i == n) { // last line
        for (int j = 1; j <= n; j++) {
          System.out.print(val + " ");
          val++;
        }
      }

      else {
        for (int j = 1; j <= n; j++) {

          
          if (i <= n / 2 + 1 ) {
            if (j == 1) System.out.print(v1 + " ");
            if (j == n) System.out.print(v2 + " ");

            if (i == n / 2 && n % 2 == 0) {
              if (n % 2 == 0) {
                if(j == 1) v1 = v1 + n;
                if (j == n)v2 = v2 + n;
              }
              
            }
            else {
              if (i != n / 2 + 1) {
                if(j == 1) v1 = v1 + 2 * n;
                if (j == n) v2 = v2 + 2 * n;
              }
            }
            if(i==n/2+1 && n%2 != 0){
                if (j == 1) v1 = v1 - n;
                if (j == n) v2 = v2 - n;
            }

          }
          
          else {
              
            if(i == n/2 + 2 && n%2 != 0){
                
                if(j == 1) v1 = v1 + 2*n;
                if(j == n) v2 = v2 + 2*n;
                
            }  

            if(j == 1) v1 = v1 - 2 * n;
            if (j == n) v2 = v2 - 2 * n;
            if (j == 1) System.out.print(v1 + " ");
            if (j == n) System.out.print(v2 + " ");


          }
          if (j > 1 && j < n) System.out.print("* ");
        }
      }

      System.out.println();

    }
  }
}