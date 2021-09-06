import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  

        int div = Divisor(n); // calling a fn to get DIVISOR

        while (div >= 1){

            int q = n / div ;
            System.out.println(q); // output Quotient
            n = n % div ;
            div = div / 10;

        }
           

    }
    // function
    static int Divisor (int n) {

        int i = 1;
        while (n >= 10){

            n = n / 10;
            i =  i * 10;

        }
            return i;
    }  
}
