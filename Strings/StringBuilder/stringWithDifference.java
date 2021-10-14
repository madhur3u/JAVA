import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
    
    // function to construct needed string
    public static String solution(String s){

        StringBuilder sb = new StringBuilder();             // sb for answer
        sb.append(s.charAt(0));                             // add the 1st character to sb
        
        for(int i = 1; i< s.length(); i++){
            
            sb.append(s.charAt(i) - s.charAt(i-1));         // add the diff b/w adjacent characters
            sb.append(s.charAt(i));                         // add the character
        }
        return sb.toString();                               // conv to string and return
    }
}
