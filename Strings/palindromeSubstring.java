import java.io.*;
import java.util.*;

public class Main {

    // to find all the palindromic substrings of a given string
    // BRUTEFORCE - find all the substrings of s first
    // check for each string if they are palindrome or not O(n**3)
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        
        // finding substrings
        for(int i = 0; i < s.length(); i++){
            for (int j = i + 1; j <= s.length(); j++){
                printPalindrome(s.substring(i,j));
            }
        } 
    }
    // this function is printing only palindromes
    // make two pointers at both ends
    // for palindrome every character from both end should be equal
    // if not return if yes print
    public static void printPalindrome(String sub){
        
        int left = 0;
        int right = sub.length() - 1;
        
        while (left < right){
            if(sub.charAt(left) != sub.charAt(right)) return;
            left ++;
            right --;
        }
        System.out.println(sub);
    }
}