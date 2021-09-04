import java.util.*;

public class Main {
  public static void main(String[] args){

    Scanner scn = new Scanner(System.in);
    System.out.println("Enter a number to find ODD / EVEN till that range");
    int n = scn.nextInt();
    int i = 1;
    while(i <= n){
      if(i%2==0) System.out.println(i + "\tis EVEN");
      else       System.out.println(i + "\tis ODD");
      i++;
    }
  }
}
