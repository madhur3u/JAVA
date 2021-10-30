import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        printEncodings(scn.nextLine(), "");     // fn call
    }

    // MAKE RECURSION TREE FOR BETTER UNDERSTANDING
    // two calls oe one call here depending upon the digits
    // as we can form character always with 1 number 1- 9
    // and with two digits we can form till 26 as z--> 26
    public static void printEncodings(String str, String ans) {
        
        // base case
        // when str len = 0, print ans
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        // taking out the 1st character of string
        char ch1 = str.charAt(0);
        
        // first checking if 1st character is '0' or not
        // as if it has zero in starting we don't need to go further
        if (ch1 == '0') return;
        
        // if not zero it will be b/w 1 - 9 and we need to take the character
        // push the alphabet coresponding to that number in ans
        // since we have the number in char we need to convert it to int
        
        int num1 = Integer.parseInt(String.valueOf(ch1));   // if ch -> '1' we will convert that to int 1
        char alphabet1 = (char)(num1 + 96);                 // 1 --> a, a ascii is 97, so 96 + 1
        
        // 1st call when we choose single number only
        // this call will always be done
        // we get the alphabet of 1st number and removed that character from string using substring
        printEncodings(str.substring(1), ans + alphabet1);
        
        // now for 2nd call 1st need to check if length of string is > 1
        if (str.length() > 1){
            
            String ch2 = str.substring(0, 2);               // taking out 1st and 2nd character  --> eg - '13'
            int num2 = Integer.parseInt(ch2);               // converting it to int --> 13 int
            
            // now this num should be <= 26 to be valid for alphabet conversion
            if (num2 <= 26){
                char alphabet2 = (char)(num2 + 96);         // 13 --> m
                
                // 2nd call push this alphabet to ans
                // and send reduced string, remove 1st 2 character this time
                printEncodings(str.substring(2), ans + alphabet2);
            }
        }
    }
}
