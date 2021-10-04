import java.util.*;

public class matrixMultiply {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        
        // input matrix 1
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] a1 = new int[n1][m1];
        for (int i = 0; i < a1.length; i++) 
        {
            for (int j = 0; j < a1[0].length; j++) 
            {
                a1[i][j] = scn.nextInt();
            }
        }
        // input matrix 2
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int[][] a2 = new int[n2][m2];
        for (int i = 0; i < a2.length; i++) 
        {
            for (int j = 0; j < a2[0].length; j++) 
            {
                a2[i][j] = scn.nextInt();
            }
        }
        scn.close();

        // a matrix can be multiplied if no. of columns of 1st matrix are equal to no. of rows of 2nd matrix  
        if (m1 == n2){
            // multiply a1 * a2
            int[][] ans = new int[n1][m2];      // multiplied matrix
            matrix_multiply(a1, a2, ans);       // func to multiply
            Display(ans);                       // func to display a 2d matrix
        }

        // if condition for a matrix not satisfied
        // then multiplication cannot be done
        else {
            System.out.println("Invalid input");
        }
    }

    // this is the function to multiply two matrix and store answer on a third matrix
    // take a row from 1st matric and a column from 2nd matric and multiply them and add
    // thats how we will get a element of our ans matrix
    // read about matrix multiplication in NET
    public static void matrix_multiply(int[][] a1, int[][] a2, int[][] ans) {
        
        // these 3 variables are made in order to keep track of loops
        // n is the no. of rows of 1st matrix which will also be no. of rows of ans matrix
        // m is the no. of columns of 2nd matrix which will also be no. of columns of ans matrix
        // mid is the no. of col of 1st matrix == no. of rows of 2nd matrix
        int n = a1.length;
        int mid = a2.length;
        int m = a2[0].length;

        // running loop ac to ans matrix
        // 1st for rows of our ans matrix and this will be for rows of 1st matrix a1
        for (int i = 0; i < n; i++) 
        {    
            // this will be for no. of col of ans matrix and no. of col on a2 too
            for (int j = 0; j < m; j++) 
            {   
                // this is for mid 
                // using this we will be able to manipuate a1 and a2 matrix 
                // multiply the row of a1 with column of a2 and add it into ans matrix a[i][j]
                for (int k = 0; k < mid; k++) 
                {        
                    ans[i][j] += a1[i][k]*a2[k][j];
                }
            }
        }
    }

    // function to print the matrix
    public static void Display(int[][] ans) {

        for (int i = 0; i < ans.length; i++) 
        {
            for (int j = 0; j < ans[0].length; j++) 
            {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}

/* 
this will be done when we need to multiply a2 with a1

        else if (m2 == n1){
            // multiply a2 * a1
            int[][] ans = new int[m1][n2];
            matrix_multiply(a2, a1, ans);
            Display(ans);
        }
*/