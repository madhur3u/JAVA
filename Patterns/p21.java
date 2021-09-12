import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.print("Input value of n : ");
        int n = scn.nextInt();
        System.out.println();

        int x = 2*n - 1;
        int st = 1;

        for (int i = 1; i<=x; i++){
            int val = n;    // intial value is n 

            for(int j = 1; j<=x; j++){ 

                System.out.print(val+" ");

                if(i <= n){   // from i = 1 till n 1st half

                    if( i+j >= i + i && i+j < 2*n)  val = val;

                    else if (i + j < i + i)         val --;

                    else                            val ++;
                }

                else{         // from i >n 2nd half

                    if( i+j >= 2*n && i+j < i + i)  val = val;

                    else if (i + j < 2*n)           val --;

                    else                            val ++;
                }

            }// Note : if there is just one line after if/else/loop then you dont need { }
            System.out.println();
        }   
    }
}
