import java.util.*;

public class Main{
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();

        int st = 1;
        for (int n = 0; n < x; n++){
            
            int nCr = 1; // initial value of nCr will be 1 for every case 
            for (int r = 0; r < st; r++){
                
                System.out.print(nCr + "\t");
                int temp = (nCr * (n - r)) / (r + 1); // this will give us the next value of combination nCr+1
                nCr = temp; // putting value of nCr+1 in nCr as we are always printing nCr
            }
            System.out.println();
            st ++;
        }

    }
}