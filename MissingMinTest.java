

public class MissingMinTest {   
    public static void main(String[] args) {

        int [] arr  = { 1,2,3,4,5,6};
        int var = 0;
        int start = arr[0];
        int end = arr.length-1;

        // for (int i = 0;i<arr.length;i++){

        //     if (arr[i+1]-arr[i] == 1){
        //         System.out.println("No missing number");
        //     }
        //     else {
        //         var = arr[i] + 1;
        //         System.out.println("Missing number is " + var);
        //         break;
                
        //     }

        // }
    }

    public static void divide(int[] array , int begin , int stop ) {

        int mid = begin + (stop - begin)/2;
        divide(array, begin, mid);
        divide(array, mid+1, stop);
        
    }
    
}
