import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];

        for (int i = 0; i< a.length; i ++)    a[i] = scn.nextInt();  // array input
        
        int d = scn.nextInt(); // to find if d is in array or not

        int pos = -1;

        for (int i = 0; i< a.length; i ++){

            if (a[i] == d) {
                pos = i;
                break;
            }   
        }      
        System.out.println(pos);  
    }
}
    
