// we can never have more than one saddle point in a matrix
// 1 -> find minimum in a row and index at which we found that minimum
// 2 -> check if this min is also maximum in the row or not
// 3 -> if yes work over as only one saadle point, else break and check next row

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception 
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];

        // taking input of 2d array
        // a.length is the no. of rows
        // a[0].length is no. of columns
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                a[i][j] = scn.nextInt();
            }
        }
       
        for (int i = 0; i < n; i++){
            
            // find the minimum in row and index at which we found min
            int min_row = a[i][0];
            int index1 = 0;            
            for (int j = 0; j < n; j++){

                if (a[i][j] < min_row){
                    min_row = a[i][j];
                    index1 = j;
                }
            }
            
            // now in the index, check for column if it is maximum
            boolean found = true;
            for (int j = 0; j < a.length; j++){
                // if we found a vaue which is max that min_row
                if (a[j][index1] > min_row){
                    found = false;
                    break;
                }
            }  
          
            // if we never found a element greater than min, found will remain true so we found our saddle point
            if (found == true){
                System.out.println(min_row);
                return;
            }
        }
        System.out.println("Invalid input");
        
    }

}
