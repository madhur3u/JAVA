// Given a N digit number find what is the maximum N-1 digit number 
// which can be formed by removing one digit at a time

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int f = max_d(n);
    System.out.println(f);
    
  }


  public static int max_d(int n) {
    int p = 10;
    int max = 0;
    while (n*10 > p){

      int r = n % p;
      int n1 = (n / p)*(p / 10) + (r % (p / 10));
      p = p * 10;
      // System.out.println(n1);
      if (n1 > max)  max = n1;
    }
    return max;
    
  }
}
