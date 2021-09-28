public class sort_0_1 {

    public static void partition(int[] a){

        int zero = 0, one = 0;                              // initialize 2 ponters at 0th index initially

        while (one < a.length)                              // loop runs till one has reached end of array
        {    
            if (a[one] == 1)                                // if at one's index we get 1 just inc one's index  
                one++;
            
            else
            {
                int temp = a[one];                          // when we found 0 at one's position
                a[one] = a[zero];                           // swap a[one] with a[zero] 
                a[zero] = temp;     

                one++;                                      // now increase index of both one, zero
                zero++;
            }
        }
    }
    // in this all the zeroes are stable sorted, means that the order of zeroes is same as order in original array, but not for one

    public static void main(String[] args){
        int[] a = {0,1,0,1,0,0,1,1,0,1,0,1,0,0,0,1,1};      // array to sort, without using count or other array
        partition(a);

        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index] + " ");
        }
    }
}
