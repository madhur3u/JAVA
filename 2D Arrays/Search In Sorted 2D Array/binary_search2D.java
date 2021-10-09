// for this question all rows should be sorted not just rows and col in INPUT
// means the last col of a row should be less than the next row's 1st col
// 11 12 13
// 21 22 23
// 31 32 33		this is a valid input

// 11 21 31
// 12 22 32
// 13 23 33		this is not

import java.util.*;

public class Main {

  	public static void main(String[] args) throws Exception {

  	  	Scanner scn = new Scanner(System.in);
  	  	int n = scn.nextInt();

  	  	int[][] a = new int[n][n];

  	  	for (int i = 0; i < n; i++)
  	  	  	for (int j = 0; j < n; j++)
  	  	    	a[i][j] = scn.nextInt();

  	  	int k = scn.nextInt();
  	  	scn.close();				// input ends here

		// first we will find the row in which our value might be present
		// we will get index of row in which k maight exist
  	  	int rowIndex = findRowIndex(a, k);

		// if row is -1 means k is not in any row, means k not in matrix
  	  	if (rowIndex == -1) {
  	  	  	System.out.println("Not Found");
			return;
  	  	}

		// if rowIndex has a value, we do binary search in that row to check for k
  	  	int colIndex = findValueInRow(a[rowIndex], k);

  	  	if (colIndex == -1) {
  	  		System.out.println("Not Found");
  	  	}
		else {
  	  		System.out.println(rowIndex);
  	  		System.out.println(colIndex);
  	  	}


  	}
	// in this function we are checking for in which row k might be present using binary search
	// make a low and high 1st and check if k exist in mid row
	// for that check if k >= a[mid][0] and k <= a[mid][n - 1]
	// if we found row return mid i.e. index of the row in which we may have k
	// chnage low and high acc to k and a[][] and if not found anywhere return -1
	public static int findRowIndex(int[][] a, int k) {

		int n = a.length;
    	int low = 0;
    	int high = n - 1 ;

		// checking till low<= high, binary search algorithm
    	while (low <= high) {

			// make mid 1st
    	  	int mid = (low + high) / 2;

			//check if k exist in mid row or not, if exist return mid
    	  	if (k >= a[mid][0] && k <= a[mid][n - 1])
    	  	  	return mid;

			// if k is smaller means we have to discard all rows below mid (including mid)
			// so change high
    	  	else if (k < a[mid][0])
    	  	  	high = mid - 1;

			// if k is greater means we have to discard all rows above mid (including mid)
			// so change low
    	  	else
    	  	  	low = mid + 1;
    	}
		// if never found
    	return -1;
  	}

	// in this we have a 1D array of only the row we need to search
	// use binary search in a 1D array to find value
  	public static int findValueInRow(int[] arr, int k) {
  	  	int low = 0;
  	  	int high = arr.length - 1;

  	  	while (low <= high) {

  	  	  	int mid = (low + high) / 2;

  	  	  	if (k > arr[mid])
				low = mid + 1;

  	  	  	else if (k < arr[mid])
  	  	  	  	high = mid - 1;

  	  	  	else
				return mid;
  	  	}
  	  	return -1;
  	}
}
