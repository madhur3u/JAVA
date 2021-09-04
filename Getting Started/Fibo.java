import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      System.out.println("Input n");
      int n = scn.nextInt();

      int a = 0, b = 1, c, i = 1;

      System.out.println();
      while ( i <= n){

        System.out.println(a);
        c = a + b;
        a = b;
        b = c;

        i++;
      }
    }
}
