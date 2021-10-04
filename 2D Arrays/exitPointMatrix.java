import java.util.*;

public class exitPointMatrix {

    public static void main(String[] args) throws Exception 
    {    
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
        scn.close();

        // we have a matrix with elements only 0 and 1
        // we need to find the exit point from which person exits
        // he starts from 0,0 towards east direction and will turn right if encounter 1
        // so we make a variable called direction whcih will tell us present direction
        // east -> 0, south -> 1, west  -> 2, north -> 3
        // we will change value of i and j depending upon the direction
        int i = 0, j = 0, direction = 0;

        // infinite loop
        while(true)   
        {   
            // whenever we encounter 1, the value of direction increase and no effect on 0
            // so we will be able to change i and j depending upon direction
            // % 4 is done as when he get east after north dir = 4 but we need zero for east, so % 4
            direction = (direction + a[i][j]) % 4;

            if (direction == 0)
            {
                // if facing east means i will remains same and j will inrease
                j++;

                // with this we also need to check if he exited or not
                // if j > len(col) or j == col that means he exited through east
                if (j == m)
                {
                    // j-- is done as he has exited but we need to print the block through which he exit
                    j--;
                    break;
                }
            }
            else if (direction == 1)
            {
                // facing south, j same, i++
                i++;

                // if he exit through south, i == n
                if (i == n)
                {
                    i--;
                    break;
                }
            }
            else if (direction == 2)
            {
                // facing west, i same, j decrease
                j--;

                // if he exit through west then j will become -1 on exit
                if (j == -1)
                {
                    j++;
                    break;
                }
            }
            else // direction == 3
            {
                // facing north j same , i decrease as going up
                i--;

                // exit through north means i == -1
                if (i == -1)
                {
                    i++;
                    break;
                }
            }
        }

        // printing the cell through which he exit
        System.out.println(i);
        System.out.println(j);
    }
}