import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int f = max3(n);
    System.out.println(f);
    
  }

// 100 % BRUTEFORCE APPROACH

  public static int max3(int n) {
    int a1,a2,a3,a4;
    int mx1,mx2,mx3,mx4;

    a4 = n % 10;                // take out all 4 no.s first
    a3 = (n % 100) / 10;
    a2 = (n % 1000) / 100;
    a1 = n / 1000;

    mx1 = a2*100 + a3*10 + a4;  // all 3 dig numbers 
    mx2 = a1*100 + a3*10 + a4;
    mx3 = a1*100 + a2*10 + a4;
    mx4 = a1*100 + a2*10 + a3;

    return (Math.max(mx1,Math.max(mx2,Math.max(mx3,mx4))));
    // find the maximum and return it
  }
}