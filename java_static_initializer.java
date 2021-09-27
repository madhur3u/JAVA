// https://www.hackerrank.com/challenges/java-static-initializer-block/problem
// https://stackoverflow.com/questions/9379426/java-when-is-a-static-initialization-block-useful

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
  static Scanner sc=new Scanner(System.in);
  
  static int B=sc.nextInt();
  static int H=sc.nextInt();
  static boolean flag=true;
  
  static{
      if(B<=0 || H<=0){
        System.out.print("java.lang.Exception: Breadth and height must be positive");
        flag=false;
      }
  }

  public static void main(String[] args){
    
    if(flag){
      
      int area=B*H;
      System.out.print(area);
    }
  }//end of main

}//end of class
