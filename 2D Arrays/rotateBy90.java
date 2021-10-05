import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] a = new int[n][n];
        // input
        for (int i = 0; i < a.length; i++){
            for (int j = 0; j < a[0].length; j++){
                a[i][j] = scn.nextInt();
            }
        }

        // first taking the transpose of matrix
        // j = i, DRY RUN with and without it to see
        for (int i = 0; i < a.length; i++){
            for (int j = i; j < a[0].length; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }
        // after transpose, reverse each row and we get answer
        // two pointers in each row and swap
        for (int i = 0; i < a.length; i++){
            
            int low = 0;
            int high = n - 1;

            while (low < high){
                int temp = a[i][low];
                a[i][low] = a[i][high];
                a[i][high] = temp;

                low++;
                high--;
            }
        }
        display(a);
    }
    // function to display array
    public static void display(int[][] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }                                                                   
} 