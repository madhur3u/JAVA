import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st1 = 1;
        int st2 = 1;
        int sp = 2*n - 3;
        for (int i = 1; i<=n; i++){

            for (int j = 1; j<=st1; j++){
                System.out.print(j +"\t");
            }

            for (int j = 1; j<=sp; j++){
                System.out.print("\t");
            } 

            for (int j = st2; j>=1; j--){
                System.out.print(j +"\t");
            }

            st1 ++;
            if(i != n-1 ) st2 ++;
            sp -= 2;
            System.out.println();
        }

    }
}
