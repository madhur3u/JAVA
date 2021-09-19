import java.io.*;
import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {

    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] a = new int[n];

    for (int i = 0; i < n; i++) a[i] = scn.nextInt();       // array INPUT
    int k = scn.nextInt();                                  // number to find range in array

    System.out.println(first_index(a,k));
    System.out.println(last_index(a,k));

  }

  public static int first_index(int[] a, int k) {           // this fn finds the first index of k in array

    int low = 0;
    int high = a.length - 1;
    int fi = -1, mid = 0;

    while (low <= high) {

      mid = (low + high) / 2;

      if (k > a[mid])        low = mid + 1;
      else if (k < a[mid])   high = mid - 1;

      else {                                                // rest all same as binary search but we don't break as we find mid
        fi = mid;                                           // we store that mid val temporarily and dec low as we need to find first value    
        high = mid - 1;                                     // so we will have our first index at fi when loop ends
      }                                                     // we are dec low here to get to left half and check if k still exist there or not
    }
    return fi;
  }
  public static int last_index(int[] a, int k) {            // this fn finds the last index of k in array

    int low = 0;
    int high = a.length - 1;
    int li = -1, mid = 0;

    while (low <= high) {

      mid = (low + high) / 2;

      if (k > a[mid])        low = mid + 1;
      else if (k < a[mid])   high = mid - 1;

      else {                                                // rest all same as binary search but we don't break as we find mid
        li = mid;                                           // we store that mid val temp and inc low as we need to find last value    
        low = mid + 1;                                      // so we will have our last index at li when loop ends
      }                                                     // we are inc low here to get to right half and check if k still exist there or not
    }
    return li;
  }
}