import java.util.Arrays;

public class ArrFrequency {
    public static void findFrequency(int[] arr){
        int size = arr.length;
        int[] frequency=new int[size];// 0
        int position = 0;
        for(int index = 0;index<size;index++){
            position = arr[index]-1;
            frequency[position]++;
        }
        System.out.println(Arrays.toString(frequency));
    }
    public static void main(String[] args) {
        int[] numbers = {2, 3, 2, 3, 5};
        // int[] numbers = {3, 3, 3, 3};
        // int[] numbers = {1};
        findFrequency(numbers);
    }
}