import java.util.*;

public class main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        scn.close();

        int d = getProduct(b, n1, n2);
        System.out.println(d);
    }

    public static int getProduct(int b, int n1, int n2) {
        // write your code here
        int carry = 0, m = 1, ans = 0;

        while (n1 > 0) {
            int r1 = n1 % 10;
            n1 = n1 / 10;
            int p = 1;
            int sum = 0;
            int temp = n2;

            while (temp > 0 || carry > 0) {
                int r2 = temp % 10;
                temp = temp / 10;

                int x = (r1 * r2) + carry;
                carry = x / b;
                x = x % b;

                sum += x * p;
                p = p * 10;

            }
            ans = getsum(b, ans, sum * m);
            m *= 10;
        }
        return ans;
    }
    public static int getsum(int b, int n1, int n2) {
        int p = 1, sum = 0, carry = 0;

        while (n1 > 0 || n2 > 0) {

            int r1 = n1 % 10;
            int r2 = n2 % 10;
            n1 = n1 / 10;
            n2 = n2 / 10;

            int x = r1 + r2 + carry;

            carry = x / b;
            x = x % b;

            sum = sum + x * p;
            p *= 10;
        }
        sum = sum + carry * p;
        return sum;
    }

}