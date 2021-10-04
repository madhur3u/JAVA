import java.util.*;

public class printing {

    public static void main(String[] args) throws Exception 
    {
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
        // output 
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++) 
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        scn.close();
    }

}
