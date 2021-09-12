import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for (int i = 1; i<=n; i++){
            for (int j = 1; j<=n; j++){
                
                if (i == 1 && (j <= n/2 + 1 || j == n)) 
                    System.out.print("* "); // first line

                else if (i <= n/2 && (j == n/2 + 1 || j == n)) 
                    System.out.print("* "); // from 2nd line before mid line

                else if (i == n/2 + 1) 
                    System.out.print("* "); // middle line

                else if (i>= n/2 + 1 && i != n && (j == n/2 + 1 || j == 1)) 
                    System.out.print("* "); // after mid line till 2nd last line

                else if (i == n && (j >= n/2 + 1 || j == 1)) 
                    System.out.print("* "); // last line

                else System.out.print("  ");

            }
            System.out.println();
        }

    }
}
