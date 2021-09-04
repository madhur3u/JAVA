/*Input: N = 15 
Output: 3 
Explanation: 
15 can be represented as: 
 

    1 + 2 + 3 + 4 + 5
    4 + 5 + 6
    7 + 8 
*/

// LINK : https://practice.geeksforgeeks.org/problems/count-of-sum-of-consecutives3741/1#

public class HelloWorld{

     public static void main(String []args){
        System.out.println("Hello World");
        
        int N = 15;
        int c = 0;
        for (int L = 1; L<N; L++){
          
            double a =(double)((1.0*N - (L*(L+1))/2 )/(L+1));
          
            if(a<=0) break;
          
            System.out.println(a);
  
            if(a - (int)a == 0.0) c ++;
            
        }
        System.out.println("No. of consecutive pairs : "+c);
        
     }
}
/* Approach: The idea is to represent N as a sequence of length L+1 as: 
N = a + (a+1) + (a+2) + .. + (a+L) 
=> N = (L+1)*a + (L*(L+1))/2 
=> a = (N- L*(L+1)/2)/(L+1) 
We substitute the values of L starting from 1 till L*(L+1)/2 < N 
If we get 'a' as a natural number then the solution should be counted. */
