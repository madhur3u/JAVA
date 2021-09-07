import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt(); 

        System.out.println(gcd(n1,n2));
        System.out.println(lcm(n1,n2));

    }
    public static int gcd(int n1,int n2){

        while (n1 % n2 != 0){
            int r = n1 % n2;
            n1 = n2;
            n2 = r;
        }
        return n2;
    }
    public static int lcm(int n1, int n2){
        int hcf = gcd(n1,n2);
        return (n1*n2/hcf);
    }
}
