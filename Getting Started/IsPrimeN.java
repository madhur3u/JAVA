import java.util.*;

public class Main {
    public static void main(String[] args) {

      Scanner scn = new Scanner(System.in);
      System.out.println("Input range you want to check");
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();

      for (int a0 = n1; a0 <= n2; a0 ++){
        boolean isprime = true;

        for (int i = 2; i*i <= a0 ; i++){

          if(a0 % i == 0){
            isprime = false;
            break;
          }
        }
        String s = isprime ? a0 + " is prime" : a0 + " is not prime";
        System.out.println(s);
      }

    }
}
