import java.util.Arrays;

public class prefixpostfix {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6};
        int a = arr.length;
        int newarr[] = new int[a - 1];
        for (int i = 0; i < a- 1; i++) {
            int sum = arr[i] + newarr[i];
            newarr[i] = sum;
        }
        System.out.println(Arrays.toString(newarr));
    }
}
