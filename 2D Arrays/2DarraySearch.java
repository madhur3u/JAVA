import java.io.*;
import java.util.*;

public class Main {

  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[][] a = new int[n][n];

    // taking input of 2d array
    // a.length is the no. of rows
    // a[0].length is no. of columns
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a[0].length; j++) {
        a[i][j] = scn.nextInt();
      }
    }
    int k = scn.nextInt();

    // since all rows and col are sorted
    // we place pointer at 1st row max corner
    // if the value is greater than the value at corner means it will be in rows below so move pointer downwards
    // if value is smaller than waht is in a[i][j] now means value should be in the row only so move pointer leftwards
    // if value dont exist means pointer will go to j = -1 when moving left and i = n when right so not found when this happen

    // initializing 1st pointer a[0][n-1]
    int i = 0;
    int j = n - 1;

    while (j >= 0 && i < n) {

      // if value at pointer is less move pointer downwards, i++
      if (a[i][j] < k) i++;

      // if value at pointer is greater than k, so k might be in the row, j--, move left in same row
      else if (a[i][j] > k) j--;

      // if value found (a[i][j] = k)  --> print index and return
      else {
        System.out.println(i);
        System.out.println(j);
        return;
      }
    }
    // when value not found it will come here print not found
    System.out.println("Not Found");
  }
}
