import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n0 = scn.nextInt();
        int k = scn.nextInt();

        int n = N(n0); // getting no. of digits

        k = k % n; // for k greater than n 
        if (k < 0) k = n + k; // for negetive k

        int r = n0 % (int)Math.pow(10,k);
        r = r * (int)Math.pow(10,n - k);
        int q = n0 / (int)Math.pow(10,k);

        System.out.println(r+q);

    }
    // function to find no. of digits
    static int N(int n){
        int c = 0;
        while(n != 0){

            n = n/10;
            c++;
        }
        return c;
    }
}
