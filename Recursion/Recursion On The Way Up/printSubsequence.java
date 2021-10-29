import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        printSS(scn.nextLine(), "");            // fn call

    }
    public static void printSS(String str, String ans) {
        
        // base case when string length is zero
        // since we are reducing len of str by one at each call and update ans
        // so at the time str is 0 we will have result in answer
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        // take out the 1st character of the string
        // we will have two conditions in a subsequence for this character
        // that is the ch is selected or it is not
        // so we have 2 choices hence make 2 calls for both
        // take out ch and rest of string seprately
        char ch = str.charAt(0);
        str = str.substring(1);
        
        printSS(str, ans + ch);     // selecting character
        printSS(str, ans);          // rejecting character
    }
}
