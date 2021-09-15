import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int d = scn.nextInt();
    int f = getDigitFrequency(n, d);
    System.out.println(f);
  }

  public static int getDigitFrequency(int n, int d) {
    int f = 0;
    while (n!=0){
      int r = n % 10;
      n = n / 10;

      if(r == d) f++;
    }
    return f;
  }
}
