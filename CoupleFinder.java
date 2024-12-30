public class CoupleFinder {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4,4,5,5};

        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] != arr[i+1]) {
                System.out.println("The single is: " + arr[i]);
                return;
            }
        }
    }
    
}
