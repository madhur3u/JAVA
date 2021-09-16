import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int b1 = scn.nextInt();
    int b2 = scn.nextInt();
    int ans = base_dectobase(n, b1, b2);
    System.out.println(ans);
  }

  public static int basetodec(int n, int b) {
    
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
  public static int base_dectobase(int n, int b1, int b2) { 
    
    n = basetodec(n,b1); // first convert the base to decimal and then decimal to base b2
    
    int p = 1; // 10**0
    int ans = 0;

    while (n>0){

      int r = n % b2; // divide by the base to which we convert
      n = n / b2;
      ans += r * p; // multiply by the base from which we are converting and add 
      p *= 10; // multiplier will get multiplied by 10(base)
      
    }
    return ans;
  }
}