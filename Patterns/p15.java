import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int sp = n/2;
        int st = 1;
        int num = 1;
        for (int i = 1; i<=n; i++){

            int inum = num;
            for (int j = 1; j<= sp; j++){
                System.out.print("\t");
            }
            for (int j = 1; j<= st; j++){
                System.out.print(inum + "\t");
                
                if (j <= st/2) inum ++;
                else inum --;
            }
            if(i<=n/2){
                st += 2;
                sp --; 
                num ++;   
            }
            else{
                st -= 2;
                sp ++;
                num --;
            }
            
            System.out.println();
        }

    }
}
