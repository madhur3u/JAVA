import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int n3 = scn.nextInt();

        int max = Math.max(n1, Math.max(n2,n3));

        if (n1 == max && n1*n1 == n2*n2 + n3*n3) System.out.println("true");
        else if (n2 == max && n2*n2 == n1*n1 + n3*n3) System.out.println("true");
        else if (n3 == max && n3*n3 == n2*n2 + n1*n1) System.out.println("true");
        else System.out.println("false");


    }
}
