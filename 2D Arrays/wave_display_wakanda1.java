import java.util.*;

public class wave_display_wakanda1 {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];

        // taking input of 2d array
        // a.length is the no. of rows
        // a[0].length is no. of columns
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++) 
            {
                a[i][j] = scn.nextInt();
            }
        }
        scn.close();

        // print output in wave display
        // first print the 1st column in normal order
        // then next in reverse order
        // for even j we print normally and for odd j reverse
        for (int j = 0; j < a[0].length; j++) {
            
            // when j is even print normally
            if (j % 2 == 0)
            {
                for (int i = 0; i < a.length; i++) {
                    System.out.println(a[i][j]);
                }
            }
            // when j is odd, print the col in reverse
            else
            {
                for (int i = a.length - 1; i >= 0; i--) {
                    System.out.println(a[i][j]);
                }
            }
        }
    }

}