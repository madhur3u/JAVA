import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int i = 1;
        int inv = 0;
        while(n != 0){

            int r = n % 10;
            inv = inv + i * (int)Math.pow(10,r-1);
            n = n / 10;
            i++;
        }
        System.out.println(inv);
    }
}
