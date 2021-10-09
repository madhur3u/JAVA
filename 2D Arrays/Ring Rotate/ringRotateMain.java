import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] twoD = new int[n][m];
        for(int i = 0; i < twoD.length; i++){
            for(int j = 0; j < twoD[0].length; j++){
                twoD[i][j] = scn.nextInt();
            }
        }
        int shell = scn.nextInt();
        int k = scn.nextInt();

        // first extract the 1D array of the ring
        int[] a = extractRing(twoD, shell);

        // now rotate this 1D array
        rotate(a, k);

        // now fill the shell with rotated 1D array
        fill2Darray(twoD, a, shell);

        display(twoD);

    }

    // in this we have our 2d array and shell number
    // we will be making a 1d array with all shell elemnts, and return that
    // taking the border element index of shell we can traverse through border using spiral display logic
    public static int[] extractRing(int[][] twoD, int shell){

        int rowLen = twoD.length;
        int colLen = twoD[0].length;

        int rmin = shell - 1;           // here we find the corner elements index
        int cmin = shell - 1;           // so that we can traverse the border
        int rmax = rowLen - shell;      // traverse wall just like spiral display
        int cmax = colLen - shell;      // but only once as we just need border not inner elements

        int index = 0;
		int aLen;

		if (cmax == cmin && rmax == rmin)	aLen = 1;					// if shell has only 1 element
		else if (cmax == cmin)				aLen = rmax - rmin + 1;		// if shell is a single row
		else if (rmax == rmin)				aLen = cmax - cmin + 1;		// if shell is a single column
		else 								aLen = 2*( (cmax - cmin + 1) + (rmax - rmin + 1) ) - 4;
		// -4 is done as every corner element is occuring twice
		// from above we get length of 1D array we are constructing in all diff cases

        int[] a = new int[aLen];

        // left wall
        for (int i = rmin, j = cmin ; i <= rmax ; i++ ){
            a[index] = twoD[i][j];
            index++;
        }
		if (index == aLen) return a;	// check for if shell is a single column
        cmin++;

        // bottom wall
        for (int i = rmax, j = cmin ; j <= cmax ; j++ ){
            a[index] = twoD[i][j];
            index++;
        }
		if (index == aLen) return a;	// check for if shell is a single row
        rmax--;

        // right wall
        for (int i = rmax, j = cmax ; i >= rmin ; i-- ){
            a[index] = twoD[i][j];
            index++;
        }
        cmax--;

        // top wall
        for (int i = rmin, j = cmax ; j >= cmin ; j-- ){
            a[index] = twoD[i][j];
            index++;
        }
        rmin++;

        return a;
    }

    // now we have ur 1d array we need to rotate this by given k
    // just simple logic to rotate 1d array using reverse
    public static void rotate(int[] a, int k){

        int n = a.length;
		if (n == 1) return;	// no need to rotate if only single element in array

        k = k % n;
        if (k < 0) k = k + n;

        reverse(a, 0, n - k - 1);
        reverse(a, n - k, n - 1);
        reverse(a, 0, n - 1);
    }

    // now we have our reverse 1d array
    // traverse through shell border again using above logic
    // fill the 2d array shell with the rotated 1d array
    public static void fill2Darray (int[][] twoD, int[] a, int shell){

        int rowLen = twoD.length;
        int colLen = twoD[0].length;

        int rmin = shell - 1;
        int cmin = shell - 1;
        int rmax = rowLen - shell;
        int cmax = colLen - shell;

        int index = 0;

        // left wall
        for (int i = rmin, j = cmin ; i <= rmax ; i++ ){
            twoD[i][j] = a[index];
            index++;
        }
		if (index == a.length) return;		// check for if shell is a single column
        cmin++;

        // bottom wall
        for (int i = rmax, j = cmin ; j <= cmax ; j++ ){
            twoD[i][j] = a[index];
            index++;
        }
		if (index == a.length) return;		// check for if shell is a single row
        rmax--;

        // right wall
        for (int i = rmax, j = cmax ; i >= rmin ; i-- ){
            twoD[i][j] = a[index];
            index++;
        }
        cmax--;

        // top wall
        for (int i = rmin, j = cmax ; j >= cmin ; j-- ){
            twoD[i][j] = a[index];
            index++;
        }
        rmin++;
    }

    public static void display(int[][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverse(int[] a, int left, int right ) {

        while (left < right){
          int temp = a[left];
          a[left] = a[right];
          a[right] = temp;
          left ++ ; right -- ;
        }
    }
}
