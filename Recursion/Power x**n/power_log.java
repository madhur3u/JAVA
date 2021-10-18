import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();            // let x = 2
        int n = scn.nextInt();            // let n = 4
        
        System.out.println(power(x, n));  // func call and print
    }

    public static int power(int x, int n){
        
        if (n == 0) return 1;
        
        int phalf = power(x, n/2);
        int ans = phalf * phalf;
        
        if (n % 2 == 1) ans *= x;
        
        return ans;
    }

}
