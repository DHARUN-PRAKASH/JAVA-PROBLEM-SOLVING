
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {12, 12, 12, 14, 16, 18, 18,19,19,1,2,3,3};

        Arrays.sort(arr);
        int count = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            count = 0;
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
                count++;
            }
            if (count >= 1) {
                total++;
            }
        }
        System.out.println("Total duplicated elements: " + total);
    }
}
