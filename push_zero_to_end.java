public class push_zero_to_end {

    public static void partition(int[] a){

        int value = 0, zero = 0;                                    // use same technique where we can sort one half stable

        while (zero < a.length)
        {    
            if (a[zero] == 0)                                       // since we need zero at end here 
                zero++;
            
            else
            {
                int temp = a[zero];                                 // if a[zero] not equal to zero swap it with zero which is at a[value]
                a[zero] = a[value];                                 // increase both index
                a[value] = temp;

                zero++;
                value++;
            }
            /*for (int index = 0; index < a.length; index++) {
                System.out.print(a[index] + " ");
            }
            System.out.println();*/
        }
    }

    public static void main(String[] args)
    {
        int[] a = {0,5,2,1,6,9,0,0,2,1,0,4,0,8,0};
        partition(a);

        for (int index = 0; index < a.length; index++) {
            System.out.print(a[index] + " ");
        }
    }
}
