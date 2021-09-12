import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int x = 2*n - 1;
        int st = 1;

        for (int i = 1; i<=x; i++){
            int val = 1;

            System.out.print("* "); // for printing star in 1st pos

            for(int j = 2; j<=st - 1; j++){ // loop printing the values
                 
                System.out.print(val +" "); 
                    
                if(j <= st/2) val ++; // inc the value till half point is reached
                else val--; // dec the val after half
                
            }
            System.out.println("* "); // for printing star in last pos

            if(i < n ) st += 2; // controlling the column width
            else st -= 2;
        }   
        // Note : if there is just one line after if/else/loop then you dont need { }
    }
}
