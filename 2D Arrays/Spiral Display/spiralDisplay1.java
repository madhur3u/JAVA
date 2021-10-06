import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] a = new int[n][m];
        // input
        for (int i = 0; i < a.length; i++) 
        {
            for (int j = 0; j < a[0].length; j++) 
            {
                a[i][j] = scn.nextInt();
            }
        }
        /*
        int n = 5;
        int m = 5;
        int a[][] = {{11,12,13,14,15},
                     {21,22,23,24,25},
                     {31,32,33,34,35},
                     {41,42,43,44,45},
                     {51,52,53,54,55}};
        */
        // spiral   

        // using the same approach as exit points question
        // we will change direction whenever he reaches end 
        // ans in spiral display we need to upsate the ends each time we encounter it
        // imax, jmin, etc are used to showcase endpoints
        int i = 0, j = 0, dir = 0;
        int imax = n - 1;
        int imin = 0;
        int jmax = m - 1;
        int jmin = 1;

        int c = 0;

        // loop will run n*m times till all values are printed
        while (c < n*m)
        {
            if (dir == 0){
                // dir == zero means going south
                System.out.println(a[i][j]);
                i++;

                // if we have reached till last row
                // update dir as now it will turn left
                // and also imax will be decreased as in next spiral iteration 
                // when it goes south, we dont want it to read last line we need it to
                // turn left at 2nd last line and so on
                if (i == imax){
                    imax--;
                    dir = 1;
                }
            }
            else if (dir == 1){
                // going east
                System.out.println(a[i][j]);
                j++;

                // update jmax, and dir when endpoint reached
                if (j == jmax){
                    jmax--;
                    dir = 2;
                }
            }
            else if (dir == 2){
                // going north
                System.out.println(a[i][j]);
                i--;

                if (i == imin){
                    imin++;
                    dir = 3;
                }
            }
            else{
                // going west
                System.out.println(a[i][j]);
                j--;

                // after west it will again go to south so dir == 0
                // jmin was already 1 at starting and not 0
                // this is because 1st column we have alread printed in the 1st iteration of loop
                // so we need to print 2nd column onwards hence it is 1 in start
                if (j == jmin){
                    jmin++;
                    dir = 0;
                }
            }
            c++;
        }
    }                                                                   
} 
