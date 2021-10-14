import java.io.*;
import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
    }

    public static String toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);
        
        for(int i = 0; i< sb.length(); i++){
            
            char s = sb.charAt(i);
            
            if (s >='A' && s<='Z'){
                sb.setCharAt(i, (char)((int)s+32));  // changing to lowercase
            }
            else{
                sb.setCharAt(i, (char)((int)s-32));  // changing to uppercase
            }   
        }
        return sb.toString();
    }
}
