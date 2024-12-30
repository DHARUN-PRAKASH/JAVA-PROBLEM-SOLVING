
import java.util.Arrays;


public class zeroatEndTest {

    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int n = arr.length;
        int count = 0; 

        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i]; 
                count++;
            }
        }
        while (count < n) {
            arr[count] = 0;
            count++; 
        }

        

        System.out.println("Array after moving zeros to end: " + Arrays.toString(arr) );
    }


    
}
