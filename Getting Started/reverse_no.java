import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        while (n != 0){

            System.out.println(n % 10);
            n = n / 10;

        }

    }
}
