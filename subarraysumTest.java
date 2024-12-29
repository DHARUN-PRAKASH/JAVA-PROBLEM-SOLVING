public class subarraysumTest {
    public static void main(String[] args) { 
        int[] arr = {2,-4,1,9,-6,7,-3};
        int sum = 0;
        int total = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            sum = 0;
            for ( int j=i+1 ; j <arr.length; j++){
                sum = sum+arr[j];


                if ( sum>total){
                    total = sum;
                    
                }

            }

    }
    System.out.println(total);
}
    
}
