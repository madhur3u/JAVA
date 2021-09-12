import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int x = 2*n - 1;
        int v = 0;

        for (int i = 1; i<=x; i++){

            if(i <= n) v++; // changing values according to row 
            else v--;

            for(int j = 1; j<=x; j++){
                
                if(i==j || i+j==x+1)
                    System.out.print(v+" ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
