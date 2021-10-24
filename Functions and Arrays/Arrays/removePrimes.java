import java.io.*;
import java.util.*;

public class Main {

	public static void solution(ArrayList<Integer> al){
		// write your code here
		int i = 0;
		while(i<al.size()){
		    if(isPrime(al.get(i)))
		        al.remove(i);
		    else
		        i++;
		}
	}
	
	public static boolean isPrime(int n){
	    
	    for (int i = 2; i*i <=n; i++){
	        if (n % i == 0)
	            return false;
	    }
	    return true;
	}
	
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		ArrayList<Integer> al = new ArrayList<>();
		for(int i = 0 ; i < n; i++){
			al.add(scn.nextInt());
		}
		solution(al);
		System.out.println(al);
	}

}
