/*Given an array find elements which occurs odd no. of time in the array
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {

        int a[] = {5,8,2,5,8,2,8,5,1,8,2};
        int[] b = new int[10];
        for (int i = 0 ;i < 11; i++){
            b[a[i]] ++;
        }
        for (int i = 0 ;i < 10; i++){
            if(b[i]%2 != 0) System.out.println(i);
        }
        
    }
}
