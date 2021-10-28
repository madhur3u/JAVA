import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }

    public static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    // all numbers corresponding str  0     1      2      3      4      5      6      7      8      9     
    
    //248 passes (let)
    public static ArrayList<String> getKPC(String str) {
        
        // base case --> when substring passes has nothing
        // or simply length of string passes is zero
        // pass arraylist with one empty element
        if (str.length() == 0){
            
            ArrayList<String> base_result = new ArrayList<>();
            base_result.add("");
            return base_result;
        }
        
        // logic is to take out the 1st character --> 2 
        // and give the rest (48) in recursion which we will get in previous_result
        char num1 = str.charAt(0);
        ArrayList<String> previous_result = getKPC(str.substring(1));
        
        // now we will have all combinations in 48 -->[jv,jw,jx,kv,kw,kx,lv,lw,lx]
        // now just need to add the characters corresponding to num1
        // 2 --> def --> d + previous_result, e + previous_result, f + previous_result
        // make a new arraylist which will have result
        ArrayList<String> result = new ArrayList<>();
        
        // first take out the string corresponding to num1 --> num1 is a char so -48 to get number
        String code = codes[num1 - 48];
        
        // now code --> def, loop in def and add a character one by one to previous result, store in result
        for (int i = 0; i < code.length(); i++){
            
            char ch = code.charAt(i);               // taking out each character
            
            for (String val : previous_result){     // taking out one value at a time from previous_result   
                result.add(ch + val);               // add both ch and val, push in result
            }
        }
        return result;
    }
}
