import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();        // string input whose subsequence is to be displayed
        ArrayList<String> ss = gss(str);    // calling function
        System.out.println(ss);
    }

    // Exp   --> gss(abc) = [..., ..c, .b., .bc, ] + [a.., a.c, ab., abc]
    // Ass   --> gss(bc) = [.., .c, b., bc]
    // E+A   --> gss(abc) = .+gss(bc) + a+gss(bc)
    public static ArrayList<String> gss(String str) {
        
        // base case, when string length is zero
        // we will return an arralist with size 1 but the element inside it is empty
        // as if string is empty it has one subsequence which is nothing
        if(str.length() == 0){
            
            ArrayList<String> base_result = new ArrayList<>();
            base_result.add("");
            return base_result; // [""] with size 1
        }
        
        // now we need to seprate out 1st character and all other characters after that
        // done using charat and substring from 1
        char ch = str.charAt(0);                    // abc -> a
        String ros = str.substring(1);              // abc -> bc
        
        // assume --> that gss(n-1) --> gss(bc) = [--, -c, b-, bc] will give us result for n - 1
        // and we store that in an arraylist current_result
        ArrayList<String> current_result = gss(ros);      
        
        // this will be the result we need to form and print
        ArrayList<String> result = new ArrayList<>();
        
        // now since we has [--, -c, b-, bc]
        // we need to do 2 tasks
        // 1st add a - (or nothing) in front of current_result
        // and in next iteration add 'a'
        for(String rstr: current_result){
            result.add(rstr);
        }
        // result after 1st iteration = [---, --c, -b-, -bc]
        
        for(String rstr: current_result){
            result.add(ch + rstr);
        }
        // result after 2nd iteration = [---, --c, -b-, -bc, a--, a-c, ab-, abc]
        
        return result;
    }
}
// '-' is used for better readability it will place nothing in place of -
