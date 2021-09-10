import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = 1;
        int num = 1;
        for (int i = 1; i<=n; i++){

            for (int j = 1; j<=st; j++){
                
                System.out.print(num + "\t");
                num ++;
            
            }
            System.out.println();
            st ++;
        }

    }
}