// Given a N digit number find the maximum 'd' digit number in it
// constrain d is always less than length of N
// number should be in range of INT else change program and use long for big numbers

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.println("ENTER NUMBER AND SUBSET LENGTH TO FIND MAX");
    int n = scn.nextInt();
    int d = scn.nextInt();
    int f = max_d(n,d);
    System.out.println(f);
    
  }
  public static int max_d(int n, int d) {

    int temp = n;
    int c = 0;
    while (temp > 0){
      temp = temp/10;
      c++;
    }

    int p = 10;
    int max = 0;
    while (n*10 > p){

      int r = n % p;
      int n1 = (n / p)*(p / 10) + (r % (p / 10));
      p = p * 10;

      if (c > d + 1)  n1 = max_d(n1,d);

      if (n1 > max)   max = n1;
    }
    return max;
    
  }
}
