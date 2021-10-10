import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(compression1(str));
        System.out.println(compression2(str));
    }
    // for the first compression we need to print the compressed form only
    // aaaaaabbbcccccdaaac --> abcdac
    // for this we add s.charAt(i) to our answer when adjacent char are not equal
    // since we use i+1 so we cannot go till last character --> index out of range error
    // so we add last character after coming out of the loop
    public static String compression1(String s){
        
        String s1 = "";

        for(int i = 0; i < s.length() - 1; i++){
            
            if (s.charAt(i) == s.charAt(i+1)){
                // nothing here
            }
            else {
                s1 += s.charAt(i);          // adding char when unequal
            }
        } 
        s1 += s.charAt(s.length() - 1);     // adding last character

        return s1;
    }

    // in the 2nd comp along with characters we also need to print thier count if > 1
    // aaaaaabbbcccccdaaac --> a6b3c5da3c
    // so we count chars when equal and add to string when it go to else block
    public static String compression2(String s){
        
        String s2 = "";
        int count = 1;      // this will count

        for(int i = 0; i < s.length() - 1; i++){
            
            if (s.charAt(i) == s.charAt(i+1)){  // if chars equal count inc
                count++;
            }
            else {
                s2 += s.charAt(i);              // unequal -> add char
                if (count > 1){                 // add count if > 1
                    s2 += count;
                    count = 1;                  // set count to 1 again
                }
            }
        } 
        s2 += s.charAt(s.length() - 1);         // for last character
        if (count > 1){
            s2 += count;
        }

        return s2;
    }
}