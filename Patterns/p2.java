import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = n;
        for (int i = n; i>=1; i--){
            for (int j = 1; j<=st; j++){
                System.out.print("*\t");
            }
            st--;
            System.out.println();
        }

    }
}
