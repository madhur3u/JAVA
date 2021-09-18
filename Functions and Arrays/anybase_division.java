import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();                 
        int base = scn.nextInt();

        System.out.println(any_base_division(n1,n2,base));          // calling function
    }

    public static int any_base_division(int n1, int n2, int base){

        n1 = any_base_to_decimal(n1,base);                          // converting both numbers to decimal first
        n2 = any_base_to_decimal(n2,base);

        int n = n1 / n2;                                            // divide the obtained decimal numbers
        return decimal_to_any_base(n,base);                         // convert it to original base and then return

    }
    public static int any_base_to_decimal(int n, int base){

        int power = 1; // base**0
        int ans = 0;

        while (n > 0){

            int r = n % 10;
            n = n / 10;
            ans = ans + r*power;
            power = power*base;
        }
        return ans;

    }
    public static int decimal_to_any_base(int n, int base){

        int power = 1; // 10**0
        int ans = 0;

        while (n > 0){

            int r = n % base;
            n = n / base;
            ans = ans + r*power;
            power = power*10;
        }
        return ans;
    }
}
