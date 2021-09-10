import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp1 = n/2;
        int sp2 = -1;

        for (int i = 1; i<=n; i++){

            for (int j = 1; j<=sp1; j++) System.out.print("\t");
            // spaces
            if (i!=1 && i!=n) System.out.print("*\t");
            // star 1 for n - 2 cases
            for (int j = 1; j<=sp2; j++) System.out.print("\t");
            // spaces
            System.out.println("*\t");
            // star 2

            if (i <= n/2){
                sp1--;
                sp2 += 2;
            }
            else{
                sp1++;
                sp2 -= 2;
            }

        }

    }
}