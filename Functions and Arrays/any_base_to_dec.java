import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b = scn.nextInt();
    int dn = getValueInBase(n, b);
    System.out.println(dn);
  }

  public static int getValueInBase(int n, int b) {
    
    int p = 1; // b**0
    int ans = 0;

    while (n>0){

      int r = n % 10; // divide by the base to which we convert
      n = n / 10;
      ans += r * p; // multiply by the base from which we are converting and add 
      p *= b; // multiplier will get multiplied by b(base)
      
    }
    return ans;
  }
}