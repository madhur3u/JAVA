import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        printPermutations(scn.nextLine(), "");
    }

    public static void printPermutations(String str, String ans) {
        
        // base case
        // since we are reducing str in each step
        // so when str - 0 we will have our premutation in ans
        if (str.length() == 0){
            System.out.println(ans);
            return;
        }
        
        // in str --> a b c, we have 3 choices initially
        // either fix a at 1st pos or b or c
        // so take out a first and put it in ans
        // same way take b 1st and put in ans
        // no. of choices depends upon length of string
        for (int i = 0; i < str.length(); i++){
            
            // taking out the character to be placed at 1st pos 
            // a _ _
            char ch = str.charAt(i);
            
            // then need to form a new string which do not have ch character
            // as in recursive call we will deal with this reduced string
            // this was done in newstring as we need str for next iterations also
            // b c
            String temp = str.substring(0, i) + str.substring(i + 1);
            
            printPermutations(temp, ans + ch);
        }
    }
}
