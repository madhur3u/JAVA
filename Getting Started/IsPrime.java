import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
      System.out.println("Input how many no.s you want to check");
      int t = scn.nextInt();

      for (int a0 = 1; a0 <= t; a0 ++){
        System.out.print("Input a number\t");
        int n = scn.nextInt();
        boolean isprime = true;

        for (int i = 2; i*i <= n; i++){

          if(n % i == 0){
            isprime = false;
            break;
          }
        }
        String s = isprime ? n + " is prime" : n + " is not prime";
        System.out.println(s);
      }

    }
}
