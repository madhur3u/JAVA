import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = n;
        int sp = 0;

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= sp; j++) {
                System.out.print("	");
            }

            for (int j = 1; j <= st; j++) {
                if ((i > n / 2 + 1 && i < n) && (j != 1 && j != st))
                    System.out.print("	");
                else
                    System.out.print("*	");
            }

            if (i <= n / 2) {
                st -= 2;
                sp += 1;
            } 
            else {
                sp -= 1;
                st += 2;
            }
            System.out.println();
        }
    }
}