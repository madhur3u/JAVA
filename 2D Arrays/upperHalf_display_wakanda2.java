import java.util.*;

public class upperHalf_display_wakanda2 {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];

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

        // print output of upper half of the matrix 
        // it has to print n times as upper diagonal lines are always n
        // i will always be 0 as it start from 1st row
        // and value of j will change depending upon which diagonal line we prints
        for (int c = 0; c < n; c++) {
            
            int i = 0;
            int j = c;

            // loop runs till j != n as diagonal print till end
            // and at end or right wall, value of j is always n-1
            // j and i inc to get next diagonal element
            while (j < n){
                System.out.println(a[i][j]);
                i++;
                j++;
            }
        }
    }

}