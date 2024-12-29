
import java.util.Arrays;

public class OddEvenArrayTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,7,10};
        int j = 0;
        int k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                j++;
            } else {
                k++;
            }
        }
        int[] even = new int[j];
        int[] odd = new int[k];
        j = 0;
        k = 0;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even[j] = arr[i];
                j++;
            } else {
                odd[k] = arr[i];
                k++;
            }


        }

        System.out.println(Arrays.toString(even));
        System.out.println(Arrays.toString(odd));
    }
    
}
