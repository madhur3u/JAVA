import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        printKPC(str, "");                      // fn call
    }

    public static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    // all numbers corresponding str  0     1      2      3      4      5      6      7      8      9   
    
    // eg --> 578
    public static void printKPC(String str, String ans) {
        
        // base case when len of string is zero
        // since we are reducing len of str by one at each call and update ans
        // so at the time str is 0 we will have result in answer
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        // take out the 1st character of the string, this is a number ch = 5
        // store rest of the string in str only , --> str = 78
        // now 5 has 3 possibilities here --> m, n, o
        // depending on number we may have different choices
        // so no. of calls == no. of choices, we use for loop to make no. of choices
        // n of loop = length of string at tat number mno --> 3
        char ch = str.charAt(0);
        str = str.substring(1);
        
        // take out the string corresponding to the character at ch
        String chString = codes[ch - '0']; // -'0' as ch is a character
        
        // this for loop runs for no. of characters in chString
        // so we have loop for no. of choices
        // chstring should be made character array first to be used in for-each loop
        for (char choice : chString.toCharArray()){
            printKPC(str, ans + choice);
        }
    }
}
