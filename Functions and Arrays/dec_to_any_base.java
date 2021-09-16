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
    
    int p = 1; // 10**0
    int ans = 0;

    while (n>0){

      int r = n % b; // divide by the base to which we convert
      n = n / b;
      ans += r * p; // multiply by the base from which we are converting and add 
      p *= 10; // multiplier will get multiplied by 10(base)
      
    }
    return ans;
  }
}