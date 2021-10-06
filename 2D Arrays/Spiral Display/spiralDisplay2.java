import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int minr = 0;
        int maxr = arr.length - 1;
        int minc = 0;
        int maxc = arr[0].length - 1;
        int count = 1;
        int total = n * m;

        // he concept used here is border traversal
        // 1st we move through the 1st border in 1st iteration of while loop
        // we change the value of wall elements i.e. min, max etc to shrink box after printing
        // count <= total used to check every time if we have reached the final block or not
        while(count <= total){

            // this print the left wall
            for(int i = minr, j = minc; i <= maxr && count <= total; i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;     // changing wall for next iteration

            // this print the bottom wall
            for(int i = maxr, j = minc; j <= maxc && count <= total; j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            // this print the right wall
            for(int i = maxr, j = maxc; i >= minr && count <= total; i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;
            
            // this print the top wall
            for(int i = minr, j = maxc; j >= minc && count <= total; j--){
                System.out.println(arr[i][j]);
                count++;
            }
            minr++;
        }
    }
}
