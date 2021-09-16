import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int b = scn.nextInt();
    int n1 = scn.nextInt();
    int n2 = scn.nextInt();
    int d = getSum(b, n1, n2);
    System.out.println(d);
  }

  public static int getSum(int b, int n1, int n2) {

      int p = 1, sum = 0, carry = 0;  // p = 10**0

      while (n1 != 0 || n2 != 0){ // run till both no. become zero

        int r1 = n1 % 10; // two rem for 2 no.
        int r2 = n2 % 10;
        n1 = n1 / 10;
        n2 = n2 / 10;

        int x = r1 + r2 + carry; // add the remainder and carry if we had from previous addition

        carry = x / b; // if x > b then we have to provide carry for next addition of digit which we give thr this
        x = x % b; // this will look after if x is more than base so it will provide mod value else original value

        sum = sum + x*p; 
        p = p * 10;     // inc the power by *10 so we add tens digit, hunderds digits etc on next iteration...
      }

      sum = sum + carry*p; // this is done as if we had a value of carry and when both no. are equal the loop terminates
      // without placing 1 in the end so this will look after that, if carry is 1 it is added in front if it is zero no effect
      
      return sum;

  }
}