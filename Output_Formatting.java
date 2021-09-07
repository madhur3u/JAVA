/*Input (stdin)

    hello 0
    hackerrank 65
    java 10
  
  Expected Output

    ================================
    hello          000 
    hackerrank     065 
    java           010 
    ================================
    
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");

        for(int i=0; i<3; i++) {
            String sl = sc.next();
            int x = sc.nextInt();
            
            /*("%-15s%03d%n", s1, x) % : used as a formatter. '-' : minus sign used for 
            left indentation of the string. 15s : here 15 denotes the string's minimum 
            field width 15. '0' : pads the extra 0s in the integer. 3d : here 3 denotes
            integer's minimum field width 3. %n : prints the new line.*/
            
            System.out.printf("%-15s%03d%n", sl, x);
        
        }
        System.out.println("================================");
    }
}
